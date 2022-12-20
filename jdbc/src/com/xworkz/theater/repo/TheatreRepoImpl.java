package com.xworkz.theater.repo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.theater.main.TheatreDto;

public class TheatreRepoImpl implements TheatreRepo{
	
	@Override
	public boolean save(TheatreDto dto) {
		List<TheatreDto> list =new ArrayList<TheatreDto>();

		System.out.println("Data is Saved and Pass it to Database");
		list.add(dto);
		
		return true;
	}

}
