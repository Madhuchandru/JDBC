package com.xworkz.bag.repo;

import com.xworkz.bag.dto.BagDto;

public interface BagRepoo {
	
	boolean save (BagDto dto);
	
    public BagDto findByName(String name);
	
	public BagDto findByNameAndId(String name,int id);

}
