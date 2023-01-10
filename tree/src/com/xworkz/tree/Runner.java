package com.xworkz.tree;

import com.xworkz.tree.dto.TreeDto;
import com.xworkz.tree.repo.TreeRepo;
import com.xworkz.tree.repo.TreeRepoImpl;

public class Runner {
	public static void main(String[] args) {
		TreeDto dto = new TreeDto("mango", "evergreen", 50, "karnataka", true, true, 50, 100, 6, "green");
		TreeDto dto1 = new TreeDto("banana", "evergreen", 15, "kerala", true, true, 5, 50, 1, "white");
		TreeDto dto2 = new TreeDto("apple", "evergreen",45, "JK", true, true, 15, 250, 12, "green");
		TreeDto dto3 = new TreeDto("banyan", "desideous", 100, "TN", true, true, 100, 300, 50, "green");
		TreeDto dto4 = new TreeDto("jackfruit", "evergreen", 55, "AP", true, true, 30,350, 14, "green");
		TreeRepo repo = new TreeRepoImpl();
		repo.save(dto);
		repo.save(dto1);
		repo.save(dto2);
		repo.save(dto3);
		repo.save(dto4);
		
		TreeDto read = repo.read();
		System.out.println(read);
	}

}
