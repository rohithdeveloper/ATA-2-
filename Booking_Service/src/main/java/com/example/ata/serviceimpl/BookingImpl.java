package com.example.ata.serviceimpl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ata.client.DriverClient;
import com.example.ata.client.RouteClient;
import com.example.ata.client.VehicleClient;
import com.example.ata.dto.BookingDto;
import com.example.ata.dto.DriverDto;
import com.example.ata.dto.RouteDto;
import com.example.ata.dto.VehicleDto;
import com.example.ata.exception.BookingNotFoundException;
import com.example.ata.model.Booking;
import com.example.ata.repo.BookingRepo;
import com.example.ata.service.BookingService;

@Service
public class BookingImpl implements BookingService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private BookingRepo bookingRepo;
	
	@Autowired
	private RouteClient routeClient;

	@Autowired
	private DriverClient driverClient;
	
	@Autowired
	private VehicleClient vehicleClient;

	@Override
	public BookingDto saveBooking(BookingDto bookingDto) {
		// TODO Auto-generated method stub
		Booking booking = modelMapper.map(bookingDto, Booking.class);
		Booking savedbooking = bookingRepo.save(booking);
		BookingDto dto = modelMapper.map(savedbooking, BookingDto.class);

		return dto;
	}

	@Override
	public String cancelBooking(int bookingId) {
		// TODO Auto-generated method stub
		Optional<Booking> optionalBooking = bookingRepo.findById(bookingId);
		if (optionalBooking.isPresent()) {
			bookingRepo.deleteById(bookingId);
			return "Booking canceled successfully";
		} else {
			throw new BookingNotFoundException("Booking with ID " + bookingId + " not found");
		}

	}

	@Override
	public String viewBookingStatus(int bookingId) {
		Optional<Booking> bookingOptional = bookingRepo.findById(bookingId);
		if (bookingOptional.isPresent()) {
			Booking booking = bookingOptional.get();
			boolean bookingStatus = booking.isStatus(); // Assuming 'status' is a boolean field in the Booking entity

			if (bookingStatus) {
				return "Booking is successful";
			} else {
				return "Booking failed";
			}
		} else {
			throw new BookingNotFoundException("Booking with ID " + bookingId + " not found");
		}
	}


	@Override
	public BookingDto viewBooking(int bookingId) {
		// TODO Auto-generated method stub
		Optional<Booking> optionalvehicle = bookingRepo.findById(bookingId);
		if (optionalvehicle.isPresent()) {
			Booking booking = optionalvehicle.get();
			BookingDto bookingDto = modelMapper.map(booking, BookingDto.class);
			RouteDto routeDto=routeClient.viewRoutesById(bookingId);
			DriverDto driverDto=driverClient.viewDriver(bookingId);
			VehicleDto vehicleDto=vehicleClient.getVehicleById(bookingId);
			bookingDto.setDriverDto(driverDto);
			bookingDto.setRouteDto(routeDto);
			bookingDto.setVehicleDto(vehicleDto);
			return bookingDto;
		} else {
			throw new BookingNotFoundException("Booking with id: " + bookingId + " not found");
 
		}
	}
}
