package com.jba.hotelservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.jba.hotelservice.model.Hotel;
import com.jba.hotelservice.service.HotelService;

@SpringBootApplication
@EnableEurekaClient
public class HotelServiceApplication implements CommandLineRunner {
	
	@Autowired
	private HotelService hotelService;

	public static void main(String[] args) {
		SpringApplication.run(HotelServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		hotelService.addHotel(new Hotel("hotel101","Classic","California"));
		hotelService.addHotel(new Hotel("hotel102","Regency","San Fransisco"));
		hotelService.addHotel(new Hotel("hotel103","Spice","Florida"));
		hotelService.addHotel(new Hotel("hotel104","Regalia","New york"));
		hotelService.addHotel(new Hotel("hotel105","Gazebo","Los Angeles"));
	}

}
