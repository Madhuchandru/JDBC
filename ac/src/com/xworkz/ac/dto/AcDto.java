package com.xworkz.ac.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ac_info")

public class AcDto {
	@Id
	private int id;
	private String name;
	private int price;
	private String type;
	private String material;
	
	public AcDto () {
		System.out.println("created default constructor of ac");
	}

	public AcDto(int id, String name, int price, String type, String material) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
		this.material = material;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "AcDto [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + ", material=" + material
				+ "]";
	}
	


}
