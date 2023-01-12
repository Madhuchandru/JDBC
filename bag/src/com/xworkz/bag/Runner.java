package com.xworkz.bag;

import com.xworkz.bag.dto.BagDto;
import com.xworkz.bag.repo.BagRepoImpl;
import com.xworkz.bag.repo.BagRepoo;

public class Runner {

	public static void main(String[] args) {

		BagRepoo repoo = new BagRepoImpl();

		 BagDto bagDto = new BagDto(1, "dell", "black", 200.0, 20);
		BagDto bagDto1 = new BagDto(2, "sony", "brown", 300.0, 50);
		BagDto bagDto2 = new BagDto(3, "dell", "black", 400.0, 20);
		BagDto bagDto3 = new BagDto(4, "lenovo", "red", 500.0, 20);
		BagDto bagDto4 = new BagDto(5, "laptop", "brown", 600.0, 20);
		BagDto bagDto5 = new BagDto(6, "americanBags", "black", 700.0, 20);
		BagDto bagDto6 = new BagDto(7, "skyBags", "red", 800.0, 20);
		BagDto bagDto7 = new BagDto(8, "westernTourist", "black", 900.0, 20);
		BagDto bagDto8 = new BagDto(9, "playBags", "blue", 1000.0, 20);

		 repoo.save(bagDto);
		repoo.save(bagDto1);
		repoo.save(bagDto2);
		repoo.save(bagDto3);
		repoo.save(bagDto4);
		repoo.save(bagDto5);
		repoo.save(bagDto6);
		repoo.save(bagDto7);
		repoo.save(bagDto8);
		
System.out.println(repoo.findByName("dell"));
		
		System.out.println(repoo.findByNameAndId("skybags", 7));

	}

}
