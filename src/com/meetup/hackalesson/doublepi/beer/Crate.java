package com.meetup.hackalesson.doublepi.beer;

/**
 * A crate is like a box of chocolates but for bottles.
 * 
 * @author Hans
 */
public class Crate {
	/**
	 * The size of the crate is the number of bottles it can hold.
	 */
	private int size;

	/**
	 * All the bottles this crate holds are in this array
	 */
	private Bottle[] bottles;

	/**
	 * Create a new crate with a size of 20.
	 */
	public Crate() {
		this(20);
	}

	/**
	 * Create a new crate with the given size.
	 * 
	 * @param size
	 *            number of bottles this crate can hold
	 */
	public Crate(int size) {
		this.size = size;
		this.bottles = new Bottle[size];
	}

	/**
	 * Remove all bottles from this crate. I hope you know what you are doing?
	 */
	public void removeAllBottles() {
		for (int i = 0; i < size; i++) {
			removeBottleInPlace(i);
		}
	}

	/**
	 * Checks if all bottles in this crate are empty.
	 * 
	 * @return false if the party is over false otherwise
	 */
	public boolean isEverythingEmpty() {
		// check all bottles in this crate
		for (int i = 0; i < size; i++) {
			if (bottles[i] != null && !bottles[i].isEmpty()) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Look up the bottle in the i'th place.
	 * 
	 * @param i
	 *            index of the place
	 * @return bottle at the i'th place
	 */
	public Bottle getBottleFromPlace(int i) {
		return bottles[i];
	}

	/**
	 * Set or change the bottle at the i'th place.
	 * 
	 * @param i
	 *            index of the place
	 * @param bottle
	 *            at the i'th place
	 */
	public void setBottleInPlace(int i, Bottle bottle) {
		bottles[i] = bottle;
	}

	/**
	 * Remove the bottle at the i'th place if there was any.
	 * 
	 * @param i
	 *            index of the place
	 */
	public void removeBottleInPlace(int i) {
		bottles[i] = null;
	}

	/**
	 * Return the size of this crate.
	 * 
	 * @return number of bottles this crate can hold
	 */
	public int getSize() {
		return size;
	}
}