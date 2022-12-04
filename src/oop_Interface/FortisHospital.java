package oop_Interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {

	// USA
	@Override
	public void pediaServices() {
		System.out.println("FH ----pediaServices");

	}

	@Override
	public void physioServices() {
		System.out.println("FH ----physioServices");

	}

	@Override
	public void orthoServices() {
		System.out.println("FH ----orthoServices");

	}

	// UK
	@Override
	public void ENTServices() {
		System.out.println("FH ----ENTServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("FH ----cardioServices");
	}

	// Indian
	@Override
	public void oncologyServices() {
		System.out.println("FH ----oncologyServices");

	}

	@Override
	public void neuroServices() {
		System.out.println("FH ----neuroServices");

	}

	// individual
	public void pathologyServices() {
		System.out.println("FH -- pathologyServices");
	}

	public void OPDServices() {
		System.out.println("FH -- OPDServices");
	}

	// common interface method
	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");

	}

	// WHO
	@Override
	public void covid19News() {
		System.out.println("FH -- covid19News");
	}

	@Override
	public void covid19Vaccination() {
		System.out.println("FH -- covid19Vaccination");
	}

	// Method Overriding + method overloading
	@Override
	public void dentalServices() {

	}

	@Override
	public void dentalServices(int dentists) {

	}

	@Override
	public int dentalServices(int dentists, String dentalMachine) {
		return 100;
	}

	// method hiding
	public static void medicalTraining() {
		System.out.println("US medical training");
	}
	
	//can we override default method from interface:
	
	@Override
	public void donation() {
		System.out.println("fortis medical donation");
	}

}
