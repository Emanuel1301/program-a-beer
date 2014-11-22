package com.meetup.hackalesson.doublepi.beer;

public class Barbesuch {
	public static void main(String[] args) {
		BeerBottle kindl = new BeerBottle(330, 5.1f);
		System.out.println(kindl.getBeerType());
		
		BeerBottle wein = new BeerBottle(125, 11);
		Person you = new Person("You!", Gender.FEMALE, 60);
		you.consume(wein);
		
		System.out.println(you.getPromille());
	}
}