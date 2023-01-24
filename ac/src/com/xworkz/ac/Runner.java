package com.xworkz.ac;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cache.cfg.internal.AbstractDomainDataCachingConfig;

import com.xworkz.ac.configaraton.AcConfig;
import com.xworkz.ac.dto.AcDto;

public class Runner {
	public static void main(String[] args) {

		AcDto dto = new AcDto(1, "videocon", 16000, "porteble", "Fibre");
		AcDto dto1 = new AcDto(2, "Voltas", 18000, "Ductless", "Aluminium");
		AcDto dto2 = new AcDto(3, "Daikin", 13000, "window", "Metal");
		AcDto dto3 = new AcDto(4, "Godrej", 15000, "central", "Polythene");
		AcDto dto4 = new AcDto(5, "Hitachi", 8000, "Floor Mounted", "Plastic");

		Session session =AcConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(dto);
		session.save(dto1);
		session.save(dto2);
		session.save(dto3);
		session.save(dto4);
		
		System.out.println(session.get(AcDto.class,2));
		
		Criteria criteria =session.createCriteria(AcDto.class);
		List list = criteria.list();
		for (Object object : list) {
			System.out.println(object);
		}

		transaction.commit();
		session.close();
	}
		
		
		

		
	}

}
