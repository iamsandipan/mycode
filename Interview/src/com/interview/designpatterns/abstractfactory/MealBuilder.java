package com.interview.designpatterns.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class MealBuilder {

	public Meal getLunch(){
		Item item = new Coke();
		Lunch lunch = new Lunch();
		lunch.addItem(new Coke()).addItem(new Burger());
		return lunch;
	}
	
	public Meal getDinner(){
		Item item = new Coke();
		Lunch lunch = new Lunch();
		lunch.addItem(new Coke()).addItem(new Burger());
		return lunch;
	}
}

interface Item{
	
}
class Coke implements Item{
	
}

class Burger implements Item{
	
}

abstract class Meal{
	private List<Item> items = new ArrayList<Item>();
	public  List<Item> getItems(){
		return items;
	}
}

class Lunch extends Meal{
	
	public Lunch addItem(Item item){
		getItems().add(item);
		return this;
	}
	
}