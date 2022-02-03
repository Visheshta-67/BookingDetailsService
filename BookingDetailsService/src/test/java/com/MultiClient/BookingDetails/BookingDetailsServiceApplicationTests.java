//package com.MultiClient.BookingDetails;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//import java.time.LocalDate;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringBootConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import com.BookingDetails.Entity.BookingDetails;
//import com.BookingDetails.Entity.CustomerService;
//import com.BookingDetails.Repository.BookingDetailsRepository;
//import com.BookingDetails.Service.IBookingDetailsService;
//
//@SpringBootConfiguration
//@SpringBootTest
//class BookingDetailsServiceApplicationTests {
//
//	@Autowired
//	IBookingDetailsService bookingDetailsService;
//	@MockBean
//	BookingDetailsRepository bookingDetailsRepository;
//
//	@Test
//	 void getAllBookingDetailsEqualsTest() {
//		 BookingDetails bookingDetails=new BookingDetails();
//		 bookingDetails.setBookingId(01);	 
//		 bookingDetails.setBookingDate(LocalDate.now());
//		 bookingDetails.setBookingAmt(5000);
//		 bookingDetails.setMadeOfPayment("online");
//		 bookingDetails.setCustomerService(customerService);
//		 customerService.setServiceId(101);
//		 customerService.setServiceName("Niya Sharma");
//		 customerService.setServiceCategory("Customer");
//		 customerService.setServicePrice(7000.00);
//		 when(bookingDetailsRepository.findAll()).thenReturn(Stream.of(bookingDetails).collect(Collectors.toList()));
//		 assertEquals(1, bookingDetailsService.getAllBookingDetails().size());
//	}
//	
//	
//
//}
