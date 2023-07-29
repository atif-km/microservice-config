package com.jba.hotelservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jba.hotelservice.model.Hotel;
import com.jba.hotelservice.service.HotelService;

@RestController
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	
	@PostMapping("addhotel")
	public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel){
		
		hotelService.addHotel(hotel);
		return ResponseEntity.ok(hotel);
	}
	
	@GetMapping("gethotel/{hotelId}")
	public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId){
		Hotel hotel = hotelService.findHotel(hotelId);
		return new ResponseEntity<Hotel>(hotel, HttpStatus.OK);
	}
	
	
	
	@GetMapping("hotels")
	public ResponseEntity<List<Hotel>> allHotel(){
		
	return new ResponseEntity<List<Hotel>>(hotelService.getAllHotels(), HttpStatus.OK);	
		
	}

}
