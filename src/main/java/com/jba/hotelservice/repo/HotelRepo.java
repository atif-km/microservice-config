package com.jba.hotelservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jba.hotelservice.model.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, String> {

}
