package javasessions;

public class FoodDeliverySystem {
		
	//class name - login 
	//method overloading of login method
	
	public boolean login(long phone, String pwd) {
		System.out.println("login to swiggy" + "using : "+ phone+" and "+
	pwd);
		return true;
	}
	
	public boolean login(long phone, int otp) {
		System.out.println("login to swiggy" + "using : "+ phone+" and "+
				otp);
		return true;
	}
	
	public boolean login(String username, String pwd) {
		System.out.println("login to swiggy " + "using : "+ username+" and "+
				pwd);
		return true;
	}
	
	public boolean login(String username, String pwd, int otp) {
		System.out.println("login to swiggy " + "using : "+ username+" and "+
				pwd + " and "+ otp);
		
		return true;
	}
	
	
		
	
	public static void main(String[] args) {
		
		FoodDeliverySystem obj = new FoodDeliverySystem();
		
		obj.login(9652762249l, 9968);
		obj.login("kanchan", "999kanch", 9965);

	}

}
