package com.garaloveli.polymorphism;

public class InventoryManager {
	
//	public void addAutomobile(Car c) {
//		System.out.println("Adding Car #" + c.getVIN());
//	}
//
//	public void addAutomobile(Truck t) {
//		System.out.println("Adding Truck #" + t.getVIN());
//	}
//	
//	public void addAutomobile(Motorcycle m) {
//		System.out.println("Adding Truck #" + m.getVIN());
//	}
	
	private Automobile featuredAuto = new Car();
	
	public void addFeaturedAuto (Automobile auto) {
		this.featuredAuto = auto;
		System.out.println("Adding featured auto #" + this.featuredAuto.getVIN());
	}
	
	public void addAutomobile(Automobile a) {
		
		System.out.println("Adding Automobile #" + a.getVIN());
	}
}
