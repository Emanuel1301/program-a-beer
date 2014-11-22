package com.meetup.hackalesson.doublepi.beer;

/**
 * A person is a human like you and me with legs and alcohol level.
 * 
 * @author Hans
 */
public class Person {
	/**
	 * Name of the person, usually only first name
	 */
	private String name;

	/**
	 * alcohol level
	 */
	private double promille;

	/**
	 * female or male
	 */
	private Gender gender;

	/**
	 * weight in kilograms
	 */
	private double weight;

	/**
	 * Create a new person, this is only for people over 18!
	 * 
	 * @param name
	 *            first name
	 * @param gender
	 *            male or female
	 * @param weight
	 *            weight in kilograms
	 */
	public Person(String name, Gender gender, double weight) {
		this.name = name;
		this.gender = gender;
		this.weight = weight;
	}

	/**
	 * Consume an entire bottle. But don't drink and drive!
	 * 
	 * @param bottle
	 *            beer or something else
	 */
	public void consume(Bottle bottle) {
		bottle.open();

		double drunkFluid = bottle.getCurrentVolume();
		double alcoholPercentage = bottle.getAlcoholPercentage();

		bottle.drinkSomething(bottle.getCurrentVolume());
		bottle.close();

		double alcohol = drunkFluid / 10 * alcoholPercentage * 0.08;
		double reducedBodyWeight = weight * getGenderAlcoholFactor();
		double newPromille = alcohol / reducedBodyWeight;

		promille = promille + newPromille;
	}

	/**
	 * Sleep really long to get sober again.
	 */
	public void lieIn() {
		promille = 0;
	}

	/**
	 * Compute the body alcohol factor depending on the gender.
	 * 
	 * @return value between 0 and 1
	 */
	private double getGenderAlcoholFactor() {
		if (gender == Gender.FEMALE) {
			return 0.6;
		} else { // Gender.MALE
			return 0.7;
		}
	}

	/**
	 * Name of the person
	 */
	public String getName() {
		return name;
	}

	/**
	 * Alcohol level
	 */
	public double getPromille() {
		return promille;
	}

	/**
	 * Gender
	 * 
	 * @return Gender.MALE or Gender.FEMALE
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * weight in kilograms
	 */
	public double getWeight() {
		return weight;
	}
}