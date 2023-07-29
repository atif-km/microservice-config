package com.jba.hotelservice.service;

import java.util.List;

import com.jba.hotelservice.model.Hotel;

public interface HotelService {
	
	public Hotel addHotel(Hotel hotel);
	
	public Hotel findHotel(String hotelId);
	
	public List<Hotel> getAllHotels();
	
	public Hotel removeHotel(String hotelId);

}
