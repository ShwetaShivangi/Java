package com.practice.java;

enum Country {
	ITALIAN, GERMAN, JAPNESE
}

class Car {

	String make;
	String model;
	// private static Car instance = null;

	public Car(String make, String model) {
		this.make = make;
		this.model = model;
	}

	/*
	 * public static Car getDetails(String make,String model) { if(instance ==
	 * null){ instance = new Car(make, model); } return instance;
	 * 
	 * }
	 */

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


}
