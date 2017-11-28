package com.garaloveli.polymorphism;

public class CarDealership {
	private static InventoryManager manager = new InventoryManager();
	
	public static void main(String[] args) {
		Car c = new Car();
		manager.addAutomobile(c);
		
		Truck t = new Truck();
		manager.addAutomobile(t);
		
		Motorcycle m = new Motorcycle();
		manager.addAutomobile(m);
	}

}
