package com.xworkz;

import java.util.List;

import com.xworkz.mobile.MobileDto;
import com.xworkz.repo.MobileRepo;
import com.xworkz.repo.MobileRepoImpl;
import com.xworkz.service.MobileService;
import com.xworkz.service.MobileServiceImpl;

public class Runner {
	public static void main(String[] args) {
		
		MobileDto dto=new MobileDto("vivo", 12000,"keypad","china",4);
		MobileDto dto1=new MobileDto("samsung",17000, "android","koriya", 5);
		MobileDto dto2=new MobileDto("onepluse", 25000, "android","britan", 5);
		MobileDto dto3=new MobileDto("nokia",8500,"keypad","japan", 3);
		MobileDto dto4=new MobileDto("redmi", 42000, "android","china", 5);
		
      
	MobileService service=new MobileServiceImpl();
	service.save(dto);
	service.save(dto1);
	service.save(dto2);
	service.save(dto3);
	service.save(dto4);
	
	List<MobileDto> read = service.read();
	for(MobileDto mobiledto : read)
		System.out.println(mobiledto);
	
	
	MobileDto findByBrand = service.findByBrand("vivo");
	System.out.println(findByBrand);
	
	boolean update = service.updateBrandByIndex("oppo", 0);
	System.out.println(update);

	List<MobileDto> read2 = service.read();
	for (MobileDto mobile : read2)
		System.out.println(mobile);

	boolean delete = service.deleteByIndex(0);
	System.out.println(delete);

	List<MobileDto> read3 = service.read();
	for (MobileDto mobile : read3)
		System.out.println(mobile);
	
	
	
	
	
	
	}
}
