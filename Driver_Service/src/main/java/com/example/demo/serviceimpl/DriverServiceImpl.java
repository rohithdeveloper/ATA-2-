package com.example.demo.serviceimpl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.DriverDto;
import com.example.demo.exception.DriverNotFoundException;
import com.example.demo.model.Driver;
import com.example.demo.repository.DriverRepository;
import com.example.demo.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverRepository driverRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public DriverDto save(DriverDto driverDto) {
		// TODO Auto-generated method stub
		Driver driver = modelMapper.map(driverDto, Driver.class);
		Driver savedDriver = driverRepo.save(driver);
		DriverDto driverdto = modelMapper.map(savedDriver, DriverDto.class);
		return driverdto;
	}

	@Override
	public String updateDriver(int driverNo,DriverDto driverDto) {
		// TODO Auto-generated method stub
		 Optional<Driver> optionaldriver = driverRepo.findById(driverNo);

	        if (optionaldriver.isPresent()) {
	        	Driver existingdriver = optionaldriver.get();
	        	existingdriver.setAddress(driverDto.getAddress());
	        	existingdriver.setContactNo(driverDto.getContactNo());
	        	existingdriver.setLicenseNo(driverDto.getLicenseNo());
	        	existingdriver.setName(driverDto.getName());
	           
	        	driverRepo.save(existingdriver);
	            return "driver with ID " + driverNo + " updated successfully";
	        } else {
	            throw new DriverNotFoundException("Cylinder with ID " + driverNo + " not found");
	        }
	}


	@Override
	public String deleteDriver(int driverNo) {
		// TODO Auto-generated method stub
		Optional<Driver> deletedriver = driverRepo.findById(driverNo);
		if (deletedriver.isPresent()) {
			driverRepo.delete(deletedriver.get());
			return "driver deleted successfully";
		} else {
			throw new DriverNotFoundException("driver with" + driverNo + "not found");
		}
	}

	@Override
	public DriverDto viewDriverById(int driverNo) {
		// TODO Auto-generated method stub
		Optional<Driver> driver =driverRepo.findById(driverNo);
		if(driver.isPresent()) {
			Driver c=driver.get();
			DriverDto driverdto =modelMapper.map(driver, DriverDto.class);
		
			
			return driverdto;

		}
		else {
			throw new DriverNotFoundException("Driver id not found:"+driverNo);

		}
	}
	
	
}
