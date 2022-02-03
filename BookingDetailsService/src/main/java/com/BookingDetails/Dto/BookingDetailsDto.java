package com.BookingDetails.Dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


public class BookingDetailsDto {
	
	@NotNull
	private long bookingId;
	private LocalDateTime bookingDate;
	@NotNull
	private double bookingAmount;
	@Size(min=2, max=50)
	private String modeOfPayement;
	private Long userId;
	private Long serviceId;
	private String serviceStatus;
	
	public BookingDetailsDto() {
	}

	public BookingDetailsDto(@NotNull long bookingId, LocalDateTime bookingDate, @NotNull double bookingAmount,
			@Size(min = 2, max = 50) String modeOfPayement, Long userId, Long serviceId, String serviceStatus) {
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.bookingAmount = bookingAmount;
		this.modeOfPayement = modeOfPayement;
		this.userId = userId;
		this.serviceId = serviceId;
		this.serviceStatus = serviceStatus;
	}

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
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

	public String getModeOfPayement() {
		return modeOfPayement;
	}

	public void setModeOfPayement(String modeOfPayement) {
		this.modeOfPayement = modeOfPayement;
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

	public String getServiceStatus() {
		return serviceStatus;
	}

	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
}