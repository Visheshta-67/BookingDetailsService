package com.BookingDetails.Controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BookingDetails.Dto.BookingDetailsDto;
import com.BookingDetails.Entity.BookingDetails;
import com.BookingDetails.ResponseEntites.SuccessInfo;
import com.BookingDetails.Service.IBookingDetailsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;



@RestController
@RequestMapping("/bookingdetails")
@Slf4j
@Api(value="BookingDetailsController",description="this is for providing BookingDetails for customer")
public class BookingDetailsController {
	
	@Autowired
	private IBookingDetailsService bookingDetailsService;
	
	Logger logger = LoggerFactory.getLogger(BookingDetails.class);
	
	@ApiOperation("This is for adding Booking Details")
	@PostMapping(value="/save", produces="application/json")
	public ResponseEntity<SuccessInfo> addBookingDetails(@Valid @RequestBody BookingDetails b)
	{
		String str = bookingDetailsService.addBookingDetails(b);
		logger.info("Booking details of customer are added");
		return new ResponseEntity<>(new SuccessInfo(HttpStatus.CREATED,201,str),HttpStatus.CREATED);
	}
	
	@ApiOperation("This is for fetching all Booking Details")
	@GetMapping(value="/getAll",produces="application/json")
	public List<BookingDetails> getAllBookingDetails()
	{
		return bookingDetailsService.getAllBookingDetails();
	}
	
	@ApiOperation("This is for fetching Booking Details by its bookingId")
	@GetMapping(value="/byId/{bookingId}",produces="application/json" )
	public BookingDetails getBookingDetailsById(@PathVariable("bookingId") Long bookingId)
	{
		logger.info("Booking details of customer are fetched by bookingId");
		return bookingDetailsService.getBookingDetailsById(bookingId);
	}
	
	@ApiOperation("This is for fetching Booking Details by its bookingId")
	@GetMapping(value="/byServiceId/{serviceId}",produces="application/json" )
	public List<BookingDetails> getBookingDetailsByServiceId(@PathVariable("serviceId") Long serviceId)
	{
		logger.info("Booking details of customer are fetched by serviceId");
		return bookingDetailsService.getBookingDetailsByServiceId(serviceId);
	}	
	
	@ApiOperation("This is for fetching Booking Details by its userId")
	@GetMapping(value = "/byCustomerId/{userId}", produces = "application/json")
	public List<BookingDetails> getBookingDetailsByUserId(@PathVariable("userId") Long userId)
	{
		logger.info("Booking details of customer are fetched by userId");
		return bookingDetailsService.getBookingDetailsByUserId(userId);
	}
	
	@ApiOperation("This is for deleting booking Details by booking Id")
	@PutMapping(value="/cancel/{bookingId}", produces="application/json")
	public ResponseEntity<SuccessInfo> deleteBookingDetails(@Valid @PathVariable("bookingId") Long bookingId, @RequestBody BookingDetails booking)
	{
		logger.info("BookingDetails are Successfully cancelled");
		String str=bookingDetailsService.deleteBookingDetails(bookingId, booking);
		return new ResponseEntity<>(new SuccessInfo(HttpStatus.ACCEPTED,200,str),HttpStatus.ACCEPTED);
	}

}
