package com.BookingDetails.Exception;

public class BookingDetailsNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

    public BookingDetailsNotFoundException(String message) {
    	super(message);
    }

}
