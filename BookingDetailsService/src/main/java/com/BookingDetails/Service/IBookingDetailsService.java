package com.BookingDetails.Service;

import java.util.List;

import javax.validation.Valid;

import com.BookingDetails.Dto.BookingDetailsDto;
import com.BookingDetails.Entity.BookingDetails;

public interface IBookingDetailsService {

	String addBookingDetails(@Valid BookingDetails b);

	List<BookingDetails> getAllBookingDetails();

	BookingDetails getBookingDetailsById(Long bookingId);

	String deleteBookingDetails(Long bookingId, BookingDetails booking);

	List<BookingDetails> getBookingDetailsByUserId(Long userId);

	List<BookingDetails> getBookingDetailsByServiceId(Long serviceId);

}
