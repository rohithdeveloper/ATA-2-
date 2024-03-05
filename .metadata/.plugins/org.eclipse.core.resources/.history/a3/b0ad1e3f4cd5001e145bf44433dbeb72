package com.example.demo.modelmapper;

import com.example.demo.dto.AddressDto;
import com.example.demo.entity.Address;

public class UserMapper {
	
	public static AddressDto mapToAddressDto(Address address) {
		AddressDto addDto=new AddressDto();
		addDto.setId(address.getId());
		addDto.setLandMark(address.getLandMark());
		addDto.setDistrict(address.getDistrict());
		addDto.setState(address.getState());
		addDto.setZip(address.getZip());
		return addDto;
	}
	
	public static Address mapToAddress(AddressDto addressDto) {
		Address address=new Address();
		address.setId(addressDto.getId());
		address.setLandMark(addressDto.getLandMark());
		address.setDistrict(addressDto.getDistrict());
		address.setState(addressDto.getState());
		address.setZip(addressDto.getZip());
		return address;
		
		
	}
}
