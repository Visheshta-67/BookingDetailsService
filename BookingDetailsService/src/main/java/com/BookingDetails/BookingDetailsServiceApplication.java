package com.BookingDetails;

import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@Configuration
@EnableSwagger2
public class BookingDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingDetailsServiceApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)  
		          .select()
		          .paths(PathSelectors.any())
                  .apis(RequestHandlerSelectors.basePackage("com.bookingDetails.controller"))
                  .build()
                  .apiInfo(new ApiInfo("BookingDetails Module","For getting booking details","1.0",  "Free to Use", new Contact("Visheshta Verma","/api" ,"bookingdetails@gmail.com"), "API licence", "/api",Collections.emptyList()));
	}
}


