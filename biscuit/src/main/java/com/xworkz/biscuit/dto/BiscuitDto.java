package com.xworkz.biscuit.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "biscuit")
public class BiscuitDto {

	@Id
	private int id;
	private String name;
	private int price;
	private int mfgDate;
	private String brand;

	public BiscuitDto() {
		System.out.println("Default Connstructor created..");
	}

	public BiscuitDto(int id, String name, int price, int mfgDate, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.mfgDate = mfgDate;
		this.brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(int mfgDate) {
		this.mfgDate = mfgDate;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "BiscuitDto [id=" + id + ", name=" + name + ", price=" + price + ", mfgDate=" + mfgDate + ", brand="
				+ brand + "]";
	}

}
