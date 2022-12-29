package com.xworkz.games.service;

import java.util.List;

import com.xworkz.games.gamesdto.GamesDto;
import com.xworkz.games.repo.GamesRepo;
import com.xworkz.games.repo.GamesRepoImpl;



public class GamesServiceImpl implements GamesService {

	GamesRepo repo = new GamesRepoImpl();

	@Override
	public boolean save(GamesDto dto) {
		if (dto != null) {
			if (dto.getName().length() >= 5) {
				System.out.println("data is valid and sending it to Repo");
				return repo.save(dto);
			} else {
				System.out.println("Data Invalid");
			}
		}

		return false;
	}

	@Override
	public List<GamesDto> read() {
		System.out.println("data is Validating and sending to repo");
		return repo.read();
	}

	@Override
	public GamesDto findByName(String name) {
		System.out.println("Data Validatings");
		List<GamesDto> read = repo.read();
		for (GamesDto dto : read)
			if (dto != null && dto.getName().length() >= 3 && dto.getName().equals(name)) {
				return dto;
			} else {
				System.out.println("Data Invalid");
			}
		return null;
	}

	@Override
	public boolean updateNameByIndex(String name, int index) {
		System.out.println("data is validating");
		if(name!=null && index>=0) {
			System.out.println("data validated and sending to repo");
			return repo.updateNameByIndex(name, index);
			
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

	@Override
	public boolean updatenoOfPlayersByName(int noOfPlayers, String name) {
		System.out.println("data validating");
		if(noOfPlayers>0 && noOfPlayers<15 && name!=null && name.length()>=0) {
			boolean update =repo.updatenoOfPlayersByName(noOfPlayers,name);
			return update;
			
		}
		return false;
	}

	@Override
	public boolean deletebyName(String name) {
		if(name != null) {
			System.out.println("Seraching in Repository");
			repo.deletebyName(name);
			return true;
		}
		return false;
	}

	
	
	
}


	

