package com.meetup.hackalesson.doublepi.beer;

/**
 * A beer bottle is the holy grail of all students.
 * 
 * @author Hans
 * 
 */
public class BeerBottle extends Bottle {
	/**
	 * Alcohol percentage
	 */
	private double alcoholPercentage;

	/**
	 * Create a new beer bottle with total volume and alcohol percentage.
	 * 
	 * @param totalVolume
	 * @param alcoholPercentage
	 */
	public BeerBottle(int totalVolume, double alcoholPercentage) {
		super(totalVolume);
		this.alcoholPercentage = alcoholPercentage;
	}

	/**
	 * Returns the type of beer. ONLY PERMITTED FOR BEER NERDS.
	 * 
	 * @return type of beer
	 */
	public String getBeerType() {
		String type = "";

		if (alcoholPercentage < 1.5) {
			type = "Alkoholfrei";
		} else if (alcoholPercentage < 7) {
			type = "Einfachbier";
		} else if (alcoholPercentage < 11) {
			type = "Schankbier";
		} else if (alcoholPercentage < 16) {
			type = "Vollbier";
		} else {
			type = "Starkbier";
		}

		return type;
	}

	/**
	 * Returns true if the beer bottle is "a Maß" (bavarian).
	 */
	public boolean isAMass() {
		if (getTotalVolume() == 1000) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Returns the alcohol percentage of this beer.
	 */
	public double getAlcoholPercentage() {
		return alcoholPercentage;
	}

	/**
	 * Returns a string representation of the beer bottle
	 */
	public String toString() {
		return "BeerBottle " + getName() + " with " + alcoholPercentage + "%";
	}
}