package com.example.vehicle.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vehicle.dto.VehicleDto;
import com.example.vehicle.exception.VehicleNotFoundException;
import com.example.vehicle.model.Vehicle;
import com.example.vehicle.repository.VehicleRepository;
import com.example.vehicle.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleRepository vehicleRepo;

	@Autowired
	private ModelMapper modelMapper;

	public String addVehicle(VehicleDto vehicleDto) {
		Vehicle vehicle = modelMapper.map(vehicleDto, Vehicle.class);
		Vehicle savedVehicle = vehicleRepo.save(vehicle);
		VehicleDto vehicleDto1 = modelMapper.map(savedVehicle, VehicleDto.class);

		return "vehicle saved successfully";

	}

	@Override
	public VehicleDto viewVehicleById(int id) {

		Optional<Vehicle> optionalvehicle = vehicleRepo.findById(id);
		if (optionalvehicle.isPresent()) {
			Vehicle vehicle = optionalvehicle.get();
			VehicleDto vehicleDto = modelMapper.map(vehicle, VehicleDto.class);
			return vehicleDto;
		} else {
			throw new VehicleNotFoundException("Vehicle with id: " + id + " not found");

		}

	}

	@Override
	public List<VehicleDto> viewAll() {
		// TODO Auto-generated method stub
		List<Vehicle> vehicles = vehicleRepo.findAll();
		List<VehicleDto> vehiclesDto = vehicles.stream().map(vehicle -> modelMapper.map(vehicle, VehicleDto.class))
				.collect(Collectors.toList());
		return vehiclesDto;
	}

	@Override
	public String modifyVehicleById(int vehicleNo, VehicleDto vehicleDto) {
		// TODO Auto-generated method stub
		Optional<Vehicle> vehicleOptional = vehicleRepo.findById(vehicleNo);

		if (vehicleOptional.isPresent()) {
			Vehicle updateVehicle = vehicleOptional.get();
			updateVehicle.setVehicleName(vehicleDto.getVehicleName());
			updateVehicle.setVehicleType(vehicleDto.getVehicleType());
			updateVehicle.setSeatingCapacity(vehicleDto.getSeatingCapacity());
			updateVehicle.setDriverId(vehicleDto.getDriverId());
			updateVehicle.setFarePerKm(vehicleDto.getFarePerKm());

			vehicleRepo.save(updateVehicle);
			return "Vehicle updated successfully with number: " + vehicleNo;
		} else {
			// Vehicle with the given id not found
			throw new VehicleNotFoundException("Vehicle with id: " + vehicleNo + " not found");
		}
	}

	@Override
	public String deleteVehicle(int vehicleNo) {
		// TODO Auto-generated method stub
		Optional<Vehicle> deleteVehicle = vehicleRepo.findById(vehicleNo);
		if (deleteVehicle.isPresent()) {
			vehicleRepo.delete(deleteVehicle.get());
			return "Vehicle deleted successfully with number: " + vehicleNo;
		} else {
			throw new VehicleNotFoundException("Vehicle with id: " + vehicleNo + " not found");
		}

	}

}
