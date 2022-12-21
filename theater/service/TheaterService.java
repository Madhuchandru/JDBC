package com.xworkz.theater.service;

import java.util.List;

import com.xworkz.theater.main.TheatreDto;

public interface TheaterService {
	
	public boolean save(TheatreDto dto);
	public List <TheatreDto> read(); 
	public TheatreDto findbyname(String name);

}
