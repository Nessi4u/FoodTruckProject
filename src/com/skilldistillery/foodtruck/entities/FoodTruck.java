package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
// you'll have setter, getters, to string, should only have methods to a singular food truck
	private double numericID;
	private String truckName;
	private String foodType;
	private double rating;

	public FoodTruck() {
	}

	public double getNumericID() {
		return numericID;
	}

	public void setNumericID(double numericID) {
		this.numericID = numericID;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String toString() {
		return "Here are all the food trucks in your area: " + this.getNumericID() + " Name: " + this.getTruckName()
				+ " Type of Food; " + this.getFoodType() + " Rating: " + this.getRating();
	}

}
