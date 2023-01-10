package com.xworkz.tree.dto;

public class TreeDto {
	private String name;
	private String type;
	private int hight;
	private String location;
	private boolean flower;
	private boolean fruit;
	private int lifeSpan;
	private int costOfTree;
	private int noOfbranch;
	private String colorOfstem;

	public TreeDto() {
		System.out.println("created default constructor of tree");
	}

	public TreeDto(String name, String type, int hight, String location, boolean flower, boolean fruit, int lifeSpan,
			int costOfTree, int noOfbranch, String colorOfstem) {
		super();
		this.name = name;
		this.type = type;
		this.hight = hight;
		this.location = location;
		this.flower = flower;
		this.fruit = fruit;
		this.lifeSpan = lifeSpan;
		this.costOfTree = costOfTree;
		this.noOfbranch = noOfbranch;
		this.colorOfstem = colorOfstem;
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

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isFlower() {
		return flower;
	}

	public void setFlower(boolean flower) {
		this.flower = flower;
	}

	public boolean isFruit() {
		return fruit;
	}

	public void setFruit(boolean fruit) {
		this.fruit = fruit;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public int getCostOfTree() {
		return costOfTree;
	}

	public void setCostOfTree(int costOfTree) {
		this.costOfTree = costOfTree;
	}

	public int getNoOfbranch() {
		return noOfbranch;
	}

	public void setNoOfbranch(int noOfbranch) {
		this.noOfbranch = noOfbranch;
	}

	public String getColorOfstem() {
		return colorOfstem;
	}

	public void setColorOfstem(String colorOfstem) {
		this.colorOfstem = colorOfstem;
	}

	@Override
	public String toString() {
		return "TreeDto [name=" + name + ", type=" + type + ", hight=" + hight + ", location=" + location + ", flower="
				+ flower + ", fruit=" + fruit + ", lifeSpan=" + lifeSpan + ", costOfTree=" + costOfTree
				+ ", noOfbranch=" + noOfbranch + ", colorOfstem=" + colorOfstem + "]";
	}

}
