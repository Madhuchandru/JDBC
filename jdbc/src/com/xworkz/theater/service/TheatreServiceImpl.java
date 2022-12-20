package com.xworkz.theater.service;

import com.xworkz.theater.main.TheatreDto;
import com.xworkz.theater.repo.TheatreRepo;
import com.xworkz.theater.repo.TheatreRepoImpl;

public class TheatreServiceImpl implements TheaterService {
	
	TheatreRepo repo = new TheatreRepoImpl();

	@Override
	public boolean save(TheatreDto dto) {
		if(dto!=null) {
			if(dto.getName().length()>=5) {
				System.out.println("Data is Valid and Sending it to Repo");
				repo.save(dto);
				System.out.println("Name is valid");
				return true;
				
			}
			else {
				System.out.println("data is not valid");
			}
		}
		 return   false;
	}

}
