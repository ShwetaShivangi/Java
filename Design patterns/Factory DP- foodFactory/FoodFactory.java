package com.practice.java;

import java.util.Scanner;

class FoodFactory {
	public Food getFood(String order) {

//Write your code here
if (order.equalsIgnoreCase("cake"))
return new Cake();
else if (order.equalsIgnoreCase("Pizza"))
return new Pizza();
else if (!order.equalsIgnoreCase("cake") || !order.equalsIgnoreCase("pizza"))
              throw new IllegalArgumentException("wrong order");

return null;
}//End of getFood method




 public static void main(String args[]){

	

		Scanner sc=new Scanner(System.in);
		//creating the factory
		FoodFactory foodFactory = new FoodFactory();

		//factory instantiates an object
		Food food = foodFactory.getFood(sc.nextLine());

		
		System.out.println("The factory returned "+food.getClass());
		System.out.println(food.getType());
	
	
 }

}
