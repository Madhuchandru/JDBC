package com.xworkz.cake;
import com.xworkz.cake.dto.CakeDto;
import com.xworkz.cake.service.CakeService;
import com.xworkz.cake.service.CakeServiceImpl;

public class test {
	public static void main(String[] args) {

		CakeDto dto = new CakeDto(1, "rasmalicake", 50, "rasmali", "triangle");
		CakeDto dto1 = new CakeDto(2, "ChocoCake", 25, "choco", "Rectangle");
		CakeDto dto2 = new CakeDto(3, "honeycake", 30, "honey", "square");
		CakeDto dto3 = new CakeDto(4, "Plumcake", 100, "Fruits", "Round");
		CakeDto dto4 = new CakeDto(5, "Lavacake", 30, "choco", "Round");

		CakeService service = new CakeServiceImpl();
		//service.save(dto);
//	service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//	service.save(dto4);

		CakeDto findById = service.findById(1);
	System.out.println(findById);

	boolean updateByName = service.updateByName("Bannanacake");
	System.out.println(updateByName);

		boolean deleteById = service.DeleteById(3);
		System.out.println(deleteById);
	}

}
