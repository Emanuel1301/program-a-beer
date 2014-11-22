package com.meetup.hackalesson.doublepi.beer;

/**
 * A Bottle is a single piece of glass used to hold fluids.
 * 
 * @author Hans
 */
public class Bottle {
	/**
	 * label of the bottle
	 */
	private String name;

	/**
	 * total volume in milliliters
	 */
	private int totalVolume;

	/**
	 * current volume in milliliters
	 */
	private int currentVolume;

	/**
	 * is true if the bottle is empty otherwise false
	 */
	private boolean isEmpty;

	/**
	 * is true if the bottle is open otherwise false. if the bottle is open you
	 * can close it otherwise you can open it
	 */
	private boolean isOpen;

	/**
	 * Creates a new fulfilled and closed bottle with a total volume of 500
	 * milliliters.
	 */
	public Bottle() {
		this(500);
	}

	/**
	 * Creates a new fulfilled and closed with the given total volume.
	 * 
	 * @param totalVolume
	 *            total volume in milliliters
	 */
	public Bottle(int totalVolume) {
		this.totalVolume = totalVolume;
		this.currentVolume = totalVolume;
		this.isEmpty = false;
		this.isOpen = false;
	}

	/**
	 * Returns the name of the bottle
	 * 
	 * @return name of the bottle
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the total volume of the bottle
	 * 
	 * @return total volume in milliliters
	 */
	public int getTotalVolume() {
		return totalVolume;
	}

	/**
	 * Returns the current volume of the bottle
	 * 
	 * @return current volume in milliliters
	 */
	public int getCurrentVolume() {
		return currentVolume;
	}

	/**
	 * Drink the given volume of fluids out of the bottle.
	 * 
	 * @param volume
	 *            volume of fluids to drink in milliliters
	 */
	public void drinkSomething(int volume) {
		if (!isOpen) {
			System.out.println("Bottle is closed!");
			return;
		}

		if (currentVolume - volume <= 0) {
			isEmpty = true;
			currentVolume = 0;
		} else {
			currentVolume -= volume;
		}
	}

	/**
	 * Returns true if bottle is empty otherwise false
	 * 
	 * @return true if empty
	 */
	public boolean isEmpty() {
		return isEmpty;
	}

	/**
	 * Returns true if the bottle is open otherwise false
	 * 
	 * @return true if open
	 */
	public boolean isOpen() {
		return isOpen;
	}

	/**
	 * Open the bottle
	 */
	public void open() {
		isOpen = true;
	}

	/**
	 * Close the bottle
	 */
	public void close() {
		isOpen = false;
	}

	/**
	 * Computes the degree of filling as a percentage
	 * 
	 * @return degree of filling
	 */
	public double getFillPercentage() {
		double fillPercentage = 100.0 * currentVolume / totalVolume;

		return fillPercentage;
	}
	
	/**
	 * This is a child friendly bottle.
	 * @return alwasy zero
	 */
	public double getAlcoholPercentage() {
		return 0;
	}

	/**
	 * Returns a string representation of the bottle
	 */
	public String toString() {
		return "Bottle " + name;
	}
}