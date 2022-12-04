package oop_inheritance;

public class Car extends Vehicle {
	
	int speed =100;
	
	static int wheels = 4;
	
	//Override method cannot be private
	//private method cannot be inherited or Overridden
	
	//final:
	//to prevent method overriding
	//to prevent inheritance -- class final
	//to provide constant data
	
	public void start() {
		System.out.println("car--start");
	}
	
	public void stop() {
		System.out.println("car--stop");
	}
	
	public void refuel() {
		System.out.println("car--refuel");
	}
	
	public static void billing() {
		System.out.println("Car---Billing");
	}
	

}
