package com.xworkz.theater.repo;

import java.util.List;

import com.xworkz.theater.main.TheatreDto;

public interface TheatreRepo {
	
	public boolean save(TheatreDto dto);


	public List<TheatreDto> read();
	
	public TheatreDto findbyname(String name);
	
	
	

}
