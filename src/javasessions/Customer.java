package javasessions;

public class Customer {
	
	String name;
	int age;
	static String compName = "Amazon";
	
	public void sendMail(){
	System.out.println("send mail");	
	}
	
	public static void getInfo() {
		System.out.println("get info");
	}

	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.name = "Priyanka";
		c.age = 25;
		
		System.out.println(c.name + " "+c.age + " "+ Customer.compName);
		
		System.out.println(compName);//static variable can access directly
		//but good practice is to use with class name
		
		//how to access static methods:
		//1. using class name:
		Customer.getInfo();
		
		//2. calling directly
		getInfo();
		
		//3. using object ref? we should not access static method using object reference
		//c.getInfo();no error message but not recommended 
		
		//how to access non static vars and methods: we have to create the object
		c.sendMail();
		
		
		
		

	}

}
