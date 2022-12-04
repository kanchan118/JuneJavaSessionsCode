
public class ThrowsKeyword {

	public static void addtoCart() {
		System.out.println("adding to cart");
		doPayment();
	}

	public static void generateOrderID() throws ArithmeticException {
		System.out.println("generateOrderID");
		int i = 9 / 0;
	}

	public static void doPayment()  {
		System.out.println("doPayment");
		
		try {
		generateOrderID();
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming ...");
			e.printStackTrace();
		}
	}

	public static void main(String[] args){

		addtoCart();
		System.out.println("bye");

	}

}
