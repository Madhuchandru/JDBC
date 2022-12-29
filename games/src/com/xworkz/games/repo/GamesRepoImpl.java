package com.xworkz.games.repo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.games.gamesdto.GamesDto;


public class GamesRepoImpl implements GamesRepo {
	List<GamesDto> list = new ArrayList<GamesDto>();
	GamesDto dto = new GamesDto();
	
	

	@Override
	public boolean save(GamesDto dto) {
		System.out.println("data is saved and pass");
		list.add(dto);
		return false;
	}

	@Override
	public List<GamesDto> read() {
		System.out.println("data is  saving and pass it to database");
		return list;
	}

	@Override
	public GamesDto findByName(String name) {
		System.out.println("data is  saving and pass it to database");
 
		return null;
	}

	@Override
	public boolean updateNameByIndex(String name, int index) {
		System.out.println("data saving to database");
		GamesDto gamesDto = list.get(index);
		gamesDto.setName(name);
		list.set(index, gamesDto);
		return true;
	}

	@Override
	public boolean deleteByIndex(int index) {
		list.remove(index);
		return false;
	}

	@Override
	public boolean updatenoOfPlayersByName(int noOfPlayers, String name) {
		for(int i =0; i<list.size(); i++) {
			GamesDto dto =list.get(i);
			if(dto.getName()==name);
			dto.setNoOfPlayer(noOfPlayers);
			list.set(i, dto);
			return true;	
		}
		return false;
	}

	@Override
	public boolean deletebyName(String name) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equalsIgnoreCase(name)) {
				list.remove(dto);
				System.out.println("Delete Gam by name is completed");
				return true;		
			}
		}	
		return false;
	}

	

}
