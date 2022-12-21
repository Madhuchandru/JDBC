package com.xworkz.theater.service;

import java.util.List;

import com.xworkz.theater.main.TheatreDto;
import com.xworkz.theater.repo.TheatreRepo;
import com.xworkz.theater.repo.TheatreRepoImpl;

public class TheatreServiceImpl implements TheaterService {

	TheatreRepo repo = new TheatreRepoImpl();

	@Override
	public boolean save(TheatreDto dto) {
		if (dto != null) {
			if (dto.getName().length() >= 5) {
				System.out.println("Data is Valid and Sending it to Repo");
				repo.save(dto);
				System.out.println("Name is valid");
				return true;

			} else {
				System.out.println("data is not valid");
			}
		}
		return false;
	}

	@Override
	public List<TheatreDto> read() {
		return repo.read();

	}

	@Override
	public TheatreDto findbyname(String name) {
		if (name != null) {
			if (name.length() >= 3) {
				System.out.println("Name is Valid and Send to repo");
				return repo.findbyname(name);
			} else {
				System.out.println("Name is Invalid");
			}
		}

		return null;
	}

}
