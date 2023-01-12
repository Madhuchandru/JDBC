package com.xworkz.constants;

public enum BagConstant {
	
URL("jdbc:mysql://localhost:3306/xworkz_1"),
PASSWORD("Madhu@862000"),
USERNAME("root");
	
	
String values;

private BagConstant(String values) {
	this.values = values;
}


public String getValues() {
	return values;
}

	
}
