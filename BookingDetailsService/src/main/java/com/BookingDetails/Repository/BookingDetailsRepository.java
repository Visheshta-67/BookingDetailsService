package com.BookingDetails.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BookingDetails.Entity.BookingDetails;

@Repository
public interface BookingDetailsRepository extends JpaRepository<BookingDetails, Long> {

	Optional<BookingDetails> findByBookingId(Long bookingId);

	List<BookingDetails> findByServiceId(Long serviceId);

	List<BookingDetails> findByUserId(Long userId);

	

}
