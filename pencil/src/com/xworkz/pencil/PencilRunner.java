package com.xworkz.pencil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.xworkz.pencil.configaration.PencilConfig;
import com.xworkz.pencil.dto.PencileDto;

public class PencilRunner {
	public static void main(String[] args) {
		
	
	PencileDto pencileDto =new PencileDto(1, "apzara", 7, "normal", "4hb");
	PencileDto pencileDto1 =new PencileDto(2, "camel", 20, "color", "2hb");
	PencileDto pencileDto2 =new PencileDto(3, "natraj", 10, "normal", "hb");
	
Session session = PencilConfig.getSessionFactory().openSession();

Transaction beginTransation=session.beginTransaction();

session.save(pencileDto);
session.save(pencileDto1);
session.save(pencileDto2);

beginTransation.commit();
session.close();


	
	

}
}
