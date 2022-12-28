package com.xworkz.service;

import java.util.List;

import com.xworkz.mobile.MobileDto;
import com.xworkz.repo.MobileRepo;
import com.xworkz.repo.MobileRepoImpl;

public class MobileServiceImpl implements MobileService {

	MobileRepo repo = new MobileRepoImpl();
	
	@Override
	public boolean save(MobileDto dto) {
		System.out.println("data is valid and sending it to repo");
		String brand = dto.getBrand();
		String madeIn = dto.getMadeIn();
		int price = dto.getPrice();
		String type = dto.getType();
		int ram = dto.getRam();
		if (brand != null && brand.length() >= 3) {
			System.out.println("brand is valid");
			if(madeIn!=null && madeIn.length()>=3 ) {
				System.out.println("madein is valid");
				if(price>8000) {
					System.out.println("price is valid");
					if(type=="android" || type=="keypad") {
						System.out.println("type is valid");
						if(ram==3|| ram==4 ||ram==5) {
							System.out.println("ram is valid");
							repo.save(dto);
						}else {
							System.err.println("ram is invalid");
						}
					}else {
						System.err.println("type is invalid");
					}
					
	
				}else {
					System.err.println("price is invalid");
				}
			}else {
				System.err.println("madein is invalid");
			}

		} else {
			System.err.println("brand is invalid");
		}
		return true;
	}

	@Override
	public List<MobileDto> read() {
		System.out.println("data is Validating and sending to repo");
		return repo.read();
	}

	@Override
	public MobileDto findByBrand(String brand) {
		System.out.println("Data Validatings");
		List<MobileDto> read = repo.read();
		for (MobileDto dto : read)
			if (dto != null && dto.getBrand().length() >= 3 && dto.getBrand().equals(brand)) {
				return dto;
			} else {
				System.out.println("Data Invalid");
			}
		return null;
		
	}

	@Override
	public boolean updateBrandByIndex(String brand, int index) {
		System.out.println("data is validating");
		if(brand!=null && index>=0) {
			System.out.println("data validated and sending to repo");
			return repo.updateBrandByIndex(brand, index);
			
		}
		return true;
	}

	@Override
	public boolean deleteByIndex(int index) {
		System.out.println("datavalidating");
		if(index>=0) {
			System.out.println("data sending to repo");
			return repo.deleteByIndex(index);
		
		}
		return false;
	}
	
}
	

	
					
	
