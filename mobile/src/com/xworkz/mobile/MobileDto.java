package com.xworkz.mobile;





public class MobileDto {

	private String brand;
	private int price;
	private String type;
	private String madeIn;
	private int ram;
	
	public MobileDto() {
		System.out.println("created default constructed of Mobile");
	}

	public MobileDto(String brand, int price, String type, String madeIn, int ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.madeIn = madeIn;
		this.ram = ram;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "MobileDto [brand=" + brand + ", price=" + price + ", type=" + type + ", madeIn=" + madeIn + ", ram="
				+ ram + "]";
	}

	
}
	
		

