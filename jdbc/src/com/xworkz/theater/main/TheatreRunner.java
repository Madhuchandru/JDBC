package com.xworkz.theater.main;

import com.xworkz.theater.service.TheaterService;
import com.xworkz.theater.service.TheatreServiceImpl;

public class TheatreRunner {

	public static void main(String[] args) {
		
		TheatreDto dto = new TheatreDto("BharatCinemas", "Shivmogga", 150, 4, false, false, 15, 125.5, "Bhaskar", 5);
		
		
		TheaterService service = new TheatreServiceImpl();
		service.save(dto);
		System.out.println(dto);
		
		
	}

}
