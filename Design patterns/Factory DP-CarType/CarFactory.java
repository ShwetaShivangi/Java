package com.practice.java;

import java.util.Scanner;

public class CarFactory {
	
	public Car getCarType(String country) {
		
		if(country.equalsIgnoreCase("italian"))
			
			return new FiatPanda("Fiat", "Panda");
		
		else if(country.equalsIgnoreCase("german"))
			return new VolkswagenPolo("Volkswagen", "Polo");
		
		else if (country.equalsIgnoreCase("japanese"))
			return new ToyotaYaris("Toyota", "Yaris");
		else 
		return null;
		
	}

	
	
	 public static void main(String args[]){
		 
		 Scanner sc = new Scanner(System.in); 
		 
		 CarFactory cf = new CarFactory();
		 
		 Car car = cf.getCarType(sc.nextLine());
		 
		 System.out.println(car.getMake()+car.getModel());
	 }
}
