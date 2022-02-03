package com.BookingDetails.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.BookingDetails.Constant.Constants;
import com.BookingDetails.Dto.BookingDetailsDto;
import com.BookingDetails.Entity.BookingDetails;
import com.BookingDetails.Exception.BookingDetailsNotFoundException;
import com.BookingDetails.Mapper.BookingDetailsMapper;
import com.BookingDetails.Repository.BookingDetailsRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BookingDetailsServiceImpl implements IBookingDetailsService{
	
	@Autowired
	private BookingDetailsRepository bookingDetailsRepository;
	
	Logger logger = LoggerFactory.getLogger(BookingDetails.class);

	@Override
	public String addBookingDetails(BookingDetails b) {
//		BookingDetails bookingDetails= BookingDetailsMapper.dtoToEntity(b);
		b.setBookingDate(LocalDateTime.now());
		b.setServiceStatus("NOT_DELIVERED");
		bookingDetailsRepository.save(b);
		return "booking is done successfully";
	}

	@Override
	public List<BookingDetails> getAllBookingDetails() {
		return bookingDetailsRepository.findAll();
	}

	@Override
	public BookingDetails getBookingDetailsById(Long bookingId) {
		Optional<BookingDetails>result=bookingDetailsRepository.findByBookingId(bookingId);
		if(result.isPresent()) {
			return result.get();
		}
		else {
			throw new BookingDetailsNotFoundException(Constants.message2);
		}
	}

	@Override
	public String deleteBookingDetails(Long bookingId, BookingDetails booking) {
		Optional<BookingDetails> result=bookingDetailsRepository.findByBookingId(bookingId);
		BookingDetails updatedBooking = new BookingDetails();
		if(result.isPresent()) {
			updatedBooking.setBookingId(bookingId);
			updatedBooking.setUserId(booking.getUserId());
			updatedBooking.setServiceId(booking.getServiceId());
			updatedBooking.setBookingDate(booking.getBookingDate());
			updatedBooking.setBookingAmount(booking.getBookingAmount());
			updatedBooking.setModeOfPayement(booking.getModeOfPayment());
			updatedBooking.setServiceStatus("CANCELLED");
			bookingDetailsRepository.save(updatedBooking);
			return "Booking is successfully cancelled!!";
		}
		else {
			throw new BookingDetailsNotFoundException(Constants.message3);
		}
	}

	@Override
	public List<BookingDetails> getBookingDetailsByUserId(Long userId) {
		List<BookingDetails> bookingDetails = bookingDetailsRepository.findByUserId(userId);
		if(bookingDetails.isEmpty()) {
			throw new BookingDetailsNotFoundException(Constants.message3);
		}
		else {
			return bookingDetails;
		}
	}

	@Override
	public List<BookingDetails> getBookingDetailsByServiceId(Long serviceId) {
		List<BookingDetails> bookingDetails = bookingDetailsRepository.findByServiceId(serviceId);
		if(bookingDetails.isEmpty()) {
			throw new BookingDetailsNotFoundException(Constants.message3);
		}
		else {
			return bookingDetails;
		}
	}
}