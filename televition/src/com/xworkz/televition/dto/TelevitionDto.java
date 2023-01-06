package com.xworkz.televition.dto;

public class TelevitionDto {
private String brand;
private String color;
private int price;
private int size;
private String type;

public TelevitionDto() {
	System.out.println("Default cons");
}




public TelevitionDto(String brand, String color, int price, int size, String type) {
	super();
	this.brand = brand;
	this.color = color;
	this.price = price;
	this.size = size;
	this.type = type;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "TelevitionDto [brand=" + brand + ", color=" + color + ", price=" + price + ", size=" + size + ", type="
			+ type + "]";
}


}
