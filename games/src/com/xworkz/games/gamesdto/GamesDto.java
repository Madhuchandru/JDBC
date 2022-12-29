package com.xworkz.games.gamesdto;

public class GamesDto {
	public String name;
	public String type;
	public boolean national;
	public char gender;
	public int noOfPlayer;
	
	public GamesDto() {
		System.out.println("created default constructed of games");
	}

	public GamesDto(String name, String type, boolean national, char gender, int noOfPlayer) {
		super();
		this.name = name;
		this.type = type;
		this.national = national;
		this.gender = gender;
		this.noOfPlayer = noOfPlayer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isNational() {
		return national;
	}

	public void setNational(boolean national) {
		this.national = national;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getNoOfPlayer() {
		return noOfPlayer;
	}

	public void setNoOfPlayer(int noOfPlayer) {
		this.noOfPlayer = noOfPlayer;
	}

	@Override
	public String toString() {
		return "GamesDto [name=" + name + ", type=" + type + ", national=" + national + ", gender=" + gender
				+ ", noOfPlayer=" + noOfPlayer + "]";
	}
	
	
	

}
