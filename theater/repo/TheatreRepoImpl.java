package com.xworkz.theater.repo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.theater.main.TheatreDto;

public class TheatreRepoImpl implements TheatreRepo {
	List<TheatreDto> list = new ArrayList<TheatreDto>();

	@Override
	public boolean save(TheatreDto dto) {

		System.out.println("Data is Saved and Pass it to Database");
		list.add(dto);

		return true;
	}

	@Override
	public List<TheatreDto> read() {

		return list;
	}

	@Override
	public TheatreDto findbyname(String name) {
		System.out.println("find by name methd.....");
		for (TheatreDto data : list) {
			if (data.getName().equals(name)) {

				return data;
			}
		}

		return null;

	}

}
