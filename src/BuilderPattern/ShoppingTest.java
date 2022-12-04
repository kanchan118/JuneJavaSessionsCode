package BuilderPattern;

public class ShoppingTest {

	public static void main(String[] args) {
		
		Ecomm u1 = new Ecomm();//1 Object
		u1.doLogin("naveen@gmail.com", "naveen123")
			.search("macbook")
				 .addtoCart("macbook pro")
				 	.makePayment("1234 5467 7365 8966", 133)
				 		.generateOrder()
				 			.logout();
		
		u1.doLogin("naveen@gmail.com", "naveen123")
		.addtoCart("iMac")
	 		.makePayment("1234 5467 7365 8966", 133)
	 			.generateOrder()
	 				.logout();
		
		//
		u1.doLogin("dev@gmail.com", "dev123")
			.search("iPad")			 
			 	.logout();
		//
		u1.doLogin("naveen@gmail.com", "naveen123")
			.logout();
		
		//
		u1.doLogin("naveen@gmail.com", "naveen123");
		
		//
		u1.doLogin();
		
		
		
	}

}
