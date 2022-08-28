package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		// this should have the array of food trucks not the class
		Scanner userPrompt = new Scanner(System.in);
		int maxTrucks = 5;
		int count = -1;
		
		FoodTruck[] foodLot = new FoodTruck[maxTrucks];

		for (int i = 0; i <= maxTrucks; i++) {
			FoodTruck foodTruckInput = new FoodTruck();

			System.out.println("What is the name of your food Truck?");
			String truckName = userPrompt.next();

			if (truckName.equalsIgnoreCase("Quit")) {
				break;
			} else {
				foodTruckInput.setTruckName(truckName);
			}

			System.out.println("What kind of food does it serve?");
			String foodType = userPrompt.next();
			foodTruckInput.setFoodType(foodType);
			System.out.println("What is the truck's rating out of 5 stars?");
			double rating = userPrompt.nextDouble();
			foodTruckInput.setRating(rating);
			foodTruckInput.setNumericID(i + 1);
			
			foodLot[i] = foodTruckInput;
			count++;
			
		}
		FoodTruckApp FoodTruckProgram = new FoodTruckApp();
		FoodTruckProgram.Menu();
		int numSelect = userPrompt.nextInt();
		
		switch (numSelect) {
		case 1:
			for (int i = 0; i <= count; i++) {
				System.out.println(foodLot[i]);
			}
			return;
		case 2:
			System.out.println("");
			return;
		case 3:
			System.out.println("");
			return;
		case 4:
			System.out.println("");
			break;
		default:
			System.err.println("That is not a menu option.");
			return;
		}
			
	}

	public void Menu() {
		System.out.println("Select a number from below:");
		System.out.println("1. List all existing food trucks. ");
		System.out.println("2. See the average rating of food trucks. ");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Quit the program.");
	}


}
