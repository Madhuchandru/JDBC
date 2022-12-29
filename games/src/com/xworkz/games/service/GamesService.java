package com.xworkz.games.service;

import java.util.List;

import com.xworkz.games.gamesdto.GamesDto;

public interface GamesService {

	public boolean save(GamesDto dto);

	public List<GamesDto> read();

	public GamesDto findByName(String name);

	public boolean updateNameByIndex(String name, int index);
	
	public boolean deleteByIndex(int index);

	public boolean updatenoOfPlayersByName( int noOfPlayers,String name);
	
	public boolean deletebyName(String name);
	
}
