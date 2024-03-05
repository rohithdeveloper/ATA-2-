package com.example.demo.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AddressDto;
import com.example.demo.entity.Address;
import com.example.demo.modelmapper.UserMapper;
import com.example.demo.repository.AddressRepository;
import com.example.demo.service.AddressDtoService;

@Service
public class AddressServiceImpl implements AddressDtoService {

	@Autowired
	private AddressRepository addRepo;
	
	@Autowired
	private ModelMapper userMapper;
	
	@Override
	public AddressDto createAddress(AddressDto addressDto) {
		// TODO Auto-generated method stub
		
		//// convert dto to entity
		Address address=UserMapper.mapToAddress(addressDto);
		Address savedAddress=addRepo.save(address);
		
		//// convert entity to dto
		AddressDto addDto=UserMapper.mapToAddressDto(savedAddress);
		return addDto;
	}

	@Override
	public AddressDto getAddressById(Long id) {
		// TODO Auto-generated method stub
		
		Address address=addRepo.findById(id).get();
		
		return UserMapper.mapToAddressDto(address);
	}

}
