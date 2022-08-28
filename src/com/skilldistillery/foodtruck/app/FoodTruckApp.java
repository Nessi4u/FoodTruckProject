package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		// this should have the array of food trucks not the class
		Scanner userPrompt = new Scanner(System.in);
		int maxTrucks = 5;
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
			foodTruckInput.setNumericID(i+1);
			
			foodLot[i]=foodTruckInput;	
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


