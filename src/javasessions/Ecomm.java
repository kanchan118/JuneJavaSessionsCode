package javasessions;

public class Ecomm {

	// Method Overloading : (static)/compile time poly(many) + morphism(forms)
	// within the same class, when you have methods with:
	// 1. the same name
	// 2. different number/type of parameters
	// 3. the different sequence of the parameters
	// return type does not matter
	//user friendly 
	//easy to read and maintain by developers

	public void test() {// 0 param
		System.out.println("test method");
	}

	public int test(int i) {// 1 param
		return 10 + i;
	}

	public void test(String k) {// 1 param

	}

	public void test(int p, String k) {// 2 param

	}

	public void test(String b, int a) {// 2 param

	}

	//feature -- business - PO --> method
	public void login() {

	}

	public void login(String username, String password) {

	}

	public void login(String username, String password, int otp) {

	}

	public void login(String username, String password, String role) {

	}

	//
	public void search() {

	}

	public void search(String productName) {

	}

	public void search(String productName, String color) {
 
	}

	public void search(String productName, String color, int price) {

	}

	//
	public void doPayment(String upi) {

	}

	public void doPayment(String CC, int cvv, int otp) {

	}

	public void doPayment(String paypal, String pwd) {

	}

	// uber:
	public void booking(String stLocation, String endLocation) {

	}

	public void booking(String stLocation, String endLocation, String carType) {

	}
	
	public void booking(String stLocation, String endLocation, String carType , String couponCode) {

	}

	public static void main(String[] args) {

		Ecomm obj = new Ecomm();

		obj.test();
		int sum = obj.test(20);
		System.out.println(sum);
		
		obj.booking("whitefield", "JP nagar", "sedan", "naveen10");
		
	}	

}
