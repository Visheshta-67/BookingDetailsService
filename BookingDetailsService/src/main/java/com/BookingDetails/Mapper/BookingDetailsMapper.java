package com.BookingDetails.Mapper;

import com.BookingDetails.Dto.BookingDetailsDto;
import com.BookingDetails.Entity.BookingDetails;

public class BookingDetailsMapper {
	
public static BookingDetails dtoToEntity(BookingDetailsDto pd) {
		
	    BookingDetails entity=new BookingDetails();
		entity.setBookingId(pd.getBookingId());
		entity.setBookingDate(pd.getBookingDate());
		entity.setBookingAmount(pd.getBookingAmount());
		entity.setModeOfPayement(pd.getModeOfPayement());
		entity.setUserId(pd.getUserId());
		entity.setServiceId(pd.getServiceId());
		entity.setServiceStatus(pd.getServiceStatus());
		return entity;
		
    }
}
