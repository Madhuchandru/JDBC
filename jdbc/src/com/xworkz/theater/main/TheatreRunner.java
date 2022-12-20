package com.xworkz.theater.main;

import com.xworkz.theater.service.TheaterService;
import com.xworkz.theater.service.TheatreServiceImpl;

public class TheatreRunner {

	public static void main(String[] args) {
		
		TheatreDto dto1 = new TheatreDto("BharatCinemas", "Shivmogga", 150, 4, false, false, 15, 125.5, "Bhaskar", 5);
		TheatreDto dto2 = new TheatreDto("PVRCinemas", "bengalore", 154, 3, false, true, 18, 125.2, "madhu", 6);
		TheatreDto dto3 = new TheatreDto("SRSCinemas", "thumkur", 153, 2, false, false, 20, 130, "Bharath", 5);
		TheatreDto dto4 = new TheatreDto("cinepolis", "thirthahalli", 151, 5, true, false, 17, 128, "shankar", 4);
		TheatreDto dto5 = new TheatreDto("BigCinemas", "bejapura", 155, 4, false, false, 15, 125.5, "shanthi", 1);
		TheatreDto dto6 = new TheatreDto("StarTheatre", "basavanagudi", 122, 4, false, false, 11, 129, "guru", 5);
		TheatreDto dto7 = new TheatreDto("MayajaalMultiplex", "jayanagar", 125, 3, true, false, 15, 156, "vasu", 2);
		TheatreDto dto8 = new TheatreDto("RajMandirCinema", "vijayanagar", 124, 2, false, true, 16, 152, "deraj", 5);
		TheatreDto dto9 = new TheatreDto("Prasads", "mahendranagar", 160, 8, false, true, 14, 125.5, "suhas", 4);
		TheatreDto dto10 = new TheatreDto("Nandan", "magadi", 158, 4, false, false, 15, 96, "abhi",3);
		TheatreDto dto11 = new TheatreDto("Shanthi", "vinobanagar", 147, 8, false, false, 54, 130, "mani", 5);
		TheatreDto dto12 = new TheatreDto("Vinayaka", "vidyanagar", 158, 6, true, true, 33, 100, "rohan", 3);
		TheatreDto dto13 = new TheatreDto("laksmi", "Shanthinagar", 166, 3, false, false, 24, 154, "maltesh", 5);
		TheatreDto dto14 = new TheatreDto("Badra", "Soraba", 188, 5, false, true, 54, 125, "chidu", 4);
		TheatreDto dto15 = new TheatreDto("thunga", "hubli", 142, 4, true, false, 15, 154, "roshan", 5);
		
		
		
		TheaterService service = new TheatreServiceImpl();
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		service.save(dto5);
		service.save(dto6);
		service.save(dto7);
		service.save(dto8);
		service.save(dto9);
		service.save(dto10);
		service.save(dto11);
		service.save(dto12);
		service.save(dto13);
		service.save(dto14);
		service.save(dto15);
		
		
		
		
	}

}
