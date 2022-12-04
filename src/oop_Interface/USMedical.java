package oop_Interface;

public interface USMedical extends WHO {
	
	int min_fee =10;
	//interface vars are static and final by default

	// abstract method : having no method body : method prototype/ only method
	// declaration
	// cannot create object of interface
	// 100% abstraction

	public void pediaServices();

	public void physioServices();

	public void orthoServices();

	public void emergencyServices();

	public void dentalServices();

	public void dentalServices(int dentists);

	public int dentalServices(int dentists, String dentalMachine);

	// after JDK 1.8
	// two major changes:

	// 1. can have a static method with method body
	public static void medicalTraining() {
		System.out.println("US medical training");
	}

	// 2. can have a default method
	//cannot make it final - so can always be overridden 
	default void donation() {
		System.out.println("US medical donation");
	}

}
