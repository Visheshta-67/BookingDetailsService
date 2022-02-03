package com.BookingDetails.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class BookingDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bookingId;
	private Long userId;
	private Long serviceId;
	private LocalDateTime bookingDate;
	private double bookingAmount;
	private String modeOfPayment;
	private String serviceStatus;
	
	public BookingDetails() {
	}

	public BookingDetails(Long bookingId, Long userId, Long serviceId, LocalDateTime bookingDate, double bookingAmount,
			String modeOfPayment, String serviceStatus) {
		this.bookingId = bookingId;
		this.userId = userId;
		this.serviceId = serviceId;
		this.bookingDate = bookingDate;
		this.bookingAmount = bookingAmount;
		this.modeOfPayment = modeOfPayment;
		this.serviceStatus = serviceStatus;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public LocalDateTime getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}

	public double getBookingAmount() {
		return bookingAmount;
	}

	public void setBookingAmount(double bookingAmount) {
		this.bookingAmount = bookingAmount;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayement(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public String getServiceStatus() {
		return serviceStatus;
	}

	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
}