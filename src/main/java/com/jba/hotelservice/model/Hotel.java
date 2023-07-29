package com.jba.hotelservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="hotels")
public class Hotel {
	
	
	@Id
	private String hotelId;
	private String hotelName;
	private String hotelLocation;
	public Hotel(String hotelId, String hotelName, String hotelLocation) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelLocation = hotelLocation;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
