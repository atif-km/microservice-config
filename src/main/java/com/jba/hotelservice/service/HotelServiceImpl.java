package com.jba.hotelservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jba.hotelservice.model.Hotel;
import com.jba.hotelservice.repo.HotelRepo;

@Service
class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepo hotelRepo;

	@Override
	public Hotel findHotel(String hotelId) {
		
		Optional<Hotel> hotelOpt = hotelRepo.findById(hotelId);
		if(hotelOpt.isPresent()) {
			return hotelOpt.get();
		}
		return null;
	}

	@Override
	public List<Hotel> getAllHotels() {
		return hotelRepo.findAll();
	}

	@Override
	public Hotel removeHotel(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hotel addHotel(Hotel hotel) {
		hotelRepo.save(hotel);
		return hotel;
	}

}
