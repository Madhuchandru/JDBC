package com.xworkz.pencil.dto;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pencil_info")

public class PencileDto {
	@Id
	private int id;
	private String brand;
	private int price;
	private String type;
	private String hardness;
	public PencileDto () {
		System.out.println("created default constructor of pencil");
	}
	public PencileDto(int id, String brand, int price, String type, String hardness) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.hardness = hardness;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getHardness() {
		return hardness;
	}
	public void setHardness(String hardness) {
		this.hardness = hardness;
	}
	@Override
	public String toString() {
		return "PencileDto [id=" + id + ", brand=" + brand + ", price=" + price + ", type=" + type + ", hardness="
				+ hardness + "]";
	}
	
	
}
