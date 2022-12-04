package oop_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.neuroServices();
		fh.publishMedicalNews();
		
		System.out.println(USMedical.min_fee);
		System.out.println(FortisHospital.min_fee);
		
		//top casting :
		//child class object can be referred by parent interface ref val
				
		USMedical us = new FortisHospital();
		
		us.pediaServices();
		us.emergencyServices();
		us.orthoServices();
		us.physioServices();
		
		//down casting of Interface is not possible as 
		//cannot create object of Interface
		//new USMedical();
		
		
	}

}
