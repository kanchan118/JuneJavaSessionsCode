package OOP_MultipleInheritance;

public class PageTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.doLogin();
		lp.getColor();
		
		CartPage c = new CartPage();
		c.getColor();		
	}

}
