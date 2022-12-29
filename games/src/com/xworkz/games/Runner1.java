package com.xworkz.games;

import java.util.List;

import com.xworkz.games.gamesdto.GamesDto;
import com.xworkz.games.service.GamesService;
import com.xworkz.games.service.GamesServiceImpl;




public class Runner1 {
	public static void main(String[] args) {
		
		GamesService service = new GamesServiceImpl();
		
		GamesDto dto = new GamesDto("cricket", "outdoor", true, 'M',11);
		GamesDto dto1 = new GamesDto("volleyball", "outdoor", true, 'M',7);
		GamesDto dto2 = new GamesDto("football", "outdoor", true, 'M',11);
		GamesDto dto3 = new GamesDto("handball", "outdoor", true, 'F',12);
		GamesDto dto4 = new GamesDto("carrom", "indoor", true, 'M',2);
		
		service.save(dto);
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		
		System.out.println("==========================");
		
		List<GamesDto> read = service.read();
		for(GamesDto gamesdto : read)
			System.out.println(gamesdto);
		
		System.out.println("==========================");
		
		GamesDto findByName = service.findByName("carrom");
		System.out.println(findByName);
		
		System.out.println("============================");
		boolean update = service.updateNameByIndex("chess", 4);
		System.out.println(update);

		List<GamesDto> read2 = service.read();
		for (GamesDto games : read2)
			System.out.println(games);
		
		System.out.println("===========================");
		boolean delete = service.deleteByIndex(0);
		System.out.println(delete);

		List<GamesDto> read3 = service.read();
		for (GamesDto games : read3)
			System.out.println(games);
		
		System.out.println("======================");
		boolean updatenoOfPlayers =service.updatenoOfPlayersByName(6, "volleyball");
		System.out.println(updatenoOfPlayers );
		
		List<GamesDto> read4 =service.read();
		for(GamesDto reads:read4)
			System.out.println(reads);
		
		System.out.println("=======================");
		boolean delete1 = service.deletebyName("football");
		System.out.println(delete1);
//
//		List<GamesDto> read5 = service.read();
//		for (GamesDto games : read5)
//			System.out.println(games);
		boolean deletebyName = service.deletebyName("cricket");
		System.out.println(deletebyName);
		
		
	}
	}


