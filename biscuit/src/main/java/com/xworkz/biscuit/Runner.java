package com.xworkz.biscuit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.biscuit.dto.BiscuitDto;

public class Runner {

	public static void main(String[] args) {

		BiscuitDto dto = new BiscuitDto(1, "Parle-G", 10, 25, "Parle");
		BiscuitDto dto1 = new BiscuitDto(2, "Marie gold", 20, 20, "Britania");
		BiscuitDto dto2 = new BiscuitDto(3, "GoodDay", 5, 10, "Britania");
		BiscuitDto dto3 = new BiscuitDto(4, "unibic", 20, 11, "Britania");
		BiscuitDto dto4 = new BiscuitDto(5, "oreo", 10, 12, "cadbury");
        BiscuitDto dto5 = new BiscuitDto(6, "anmol", 5, 10, "parle");
        BiscuitDto dto6 = new BiscuitDto(7, "googly", 10, 18, "biskfarm");
        BiscuitDto dto7 = new BiscuitDto(8, "crackers", 20, 10, "priyagold");
        BiscuitDto dto8 = new BiscuitDto(9, "glucose", 5, 10, "sunfeast");
        BiscuitDto dto9 = new BiscuitDto(10, "patanjali", 10, 10, "patanjali");

        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

//	entityManager.persist(dto);
//	entityManager.persist(dto1);
//	entityManager.persist(dto2);
//	entityManager.persist(dto3);
//	entityManager.persist(dto4);
//    entityManager.persist(dto5);
//    entityManager.persist(dto6);
//    entityManager.persist(dto7);
//    entityManager.persist(dto8);
//    entityManager.persist(dto9);

    

	

//	BiscuitDto find = entityManager.find(BiscuitDto.class, 2);
//	System.out.println(find);

		BiscuitDto find1 = entityManager.find(BiscuitDto.class, 7);
		find1.setBrand("dukes");
		entityManager.merge(find1);
		//System.out.println(find1);
	
	//entityManager.remove(find);

		transaction.commit();
//		entityManager.close();

	}

}
