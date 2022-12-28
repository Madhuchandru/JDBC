package com.xworkz.repo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.mobile.MobileDto;

public class MobileRepoImpl implements MobileRepo  {
	List<MobileDto> list =new ArrayList<MobileDto>();
	

	@Override
	public boolean save(MobileDto dto) {
		System.out.println("data is saved and pass it to Database");
		list.add(dto);
		return true;
		
		
	}


	@Override
	public List<MobileDto> read() {
		System.out.println("data is  saving and pass it to database");
		return list;
	}


	@Override
	public MobileDto findByBrand(String brand) {
		System.out.println("data saving to Database");
		
		return null;
	}



	@Override
	public boolean updateBrandByIndex(String brand, int index) {
		System.out.println("data saving to database");
		list.remove(index);
		return false;
	}


	@Override
	public boolean deleteByIndex(int index) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
