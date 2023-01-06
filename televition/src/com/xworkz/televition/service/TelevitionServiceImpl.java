package com.xworkz.televition.service;

import com.xworkz.televition.dto.TelevitionDto;
import com.xworkz.televition.repo.TelevitionRepo;
import com.xworkz.televition.repo.TelevitionrepoImpl;

public class TelevitionServiceImpl implements TelevitionService {
TelevitionRepo read =new TelevitionrepoImpl();
	@Override
	public boolean save(TelevitionDto dto) {
		if(dto!=null && dto.getBrand().length()>=3  && dto.getPrice()>=30000 && dto.getSize()>=24);{
		System.out.println("validating");
	}
	return repo.read() ;
	}

}
