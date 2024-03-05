package com.example.ata.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ata.dto.BookingDto;
import com.example.ata.service.BookingService;

@RestController
@RequestMapping("/api/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/bookings")
    public BookingDto saveBooking(@RequestBody BookingDto bookingDto) {
        return bookingService.saveBooking(bookingDto);
    }

    @DeleteMapping("/deletebooking/{bookingId}")
    public String cancelBooking(@PathVariable int bookingId) {
        return bookingService.cancelBooking(bookingId);
    }

    @GetMapping("/booking-status/{bookingId}")
    public String viewBookingStatus(@PathVariable("bookingId") int bookingId) {
        return bookingService.viewBookingStatus(bookingId);
    }

    @GetMapping("/bookings/{bookingId}")
    public BookingDto viewBooking(@PathVariable("bookingId") int bookingId) {
        return bookingService.viewBooking(bookingId);
    }
}
