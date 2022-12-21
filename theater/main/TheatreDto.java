package com.xworkz.theater.main;

public class TheatreDto {
		private String name;
		private String location;
		private int noOfSeates;
		private int noOffloors;
		private boolean hygenics;
		private boolean soundProof;
		private int noOfworks;
		private double screensize;
		private String ownername;
		private int noofscreans;
		
		public TheatreDto() {
			System.out.println("created default costructed of Theatre");
		}
		
		
		public TheatreDto(String name, String location, int noOfSeates, int noOffloors, boolean hygenics,
				boolean soundProof, int noOfworks, double screensize, String ownername, int noofscreans) {
			super();
			this.name = name;
			this.location = location;
			this.noOfSeates = noOfSeates;
			this.noOffloors = noOffloors;
			this.hygenics = hygenics;
			this.soundProof = soundProof;
			this.noOfworks = noOfworks;
			this.screensize = screensize;
			this.ownername = ownername;
			this.noofscreans = noofscreans;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public int getNoOfSeates() {
			return noOfSeates;
		}
		public void setNoOfSeates(int noOfSeates) {
			this.noOfSeates = noOfSeates;
		}
		public int getNoOffloors() {
			return noOffloors;
		}
		public void setNoOffloors(int noOffloors) {
			this.noOffloors = noOffloors;
		}
		public boolean isHygenics() {
			return hygenics;
		}
		public void setHygenics(boolean hygenics) {
			this.hygenics = hygenics;
		}
		public boolean isSoundProof() {
			return soundProof;
		}
		public void setSoundProof(boolean soundProof) {
			this.soundProof = soundProof;
		}
		public int getNoOfworks() {
			return noOfworks;
		}
		public void setNoOfworks(int noOfworks) {
			this.noOfworks = noOfworks;
		}
		public double getScreensize() {
			return screensize;
		}
		public void setScreensize(double screensize) {
			this.screensize = screensize;
		}
		public String getOwnername() {
			return ownername;
		}
		public void setOwnername(String ownername) {
			this.ownername = ownername;
		}
		public int getNoofscreans() {
			return noofscreans;
		}
		public void setNoofscreans(int noofscreans) {
			this.noofscreans = noofscreans;
		}


		@Override
		public String toString() {
			return "TheatreDto [name=" + name + ", location=" + location + ", noOfSeates=" + noOfSeates
					+ ", noOffloors=" + noOffloors + ", hygenics=" + hygenics + ", soundProof=" + soundProof
					+ ", noOfworks=" + noOfworks + ", screensize=" + screensize + ", ownername=" + ownername
					+ ", noofscreans=" + noofscreans + "]";
		}
		
		
		
}

		
		

