package javasessions;

public class User {
	
	String name;
	int age;
	String city;
	
	

	public static void main(String[] args) {

		
		User u1 = new User();
		u1.name = "Aarthi";
		u1.age = 25;
		u1.city = "Pune";
		
		User u2 = new User();
		u2.name = "Nitin";
		u2.age = 30;
		u2.city = "Banglore";
		
		User u3 = new User();
		u3.name = "Ravi";
		u3.age = 35;
		u3.city = "LA";
		
		System.out.println(u1.name + " " + u1.age+" "+u1.city);;
		System.out.println(u2.name + " " + u2.age+" "+u2.city);
		System.out.println(u3.name + " " + u3.age+" "+u3.city);
		
		u1 = u2;
		System.out.println("------------");
		System.out.println(u1.name + " " + u1.age+" "+u1.city);;
		System.out.println(u2.name + " " + u2.age+" "+u2.city);
		System.out.println(u3.name + " " + u3.age+" "+u3.city);
		
		u2 = u3;
		System.out.println("------------");
		System.out.println(u1.name + " " + u1.age+" "+u1.city);;
		System.out.println(u2.name + " " + u2.age+" "+u2.city);
		System.out.println(u3.name + " " + u3.age+" "+u3.city);
		
		u3 = u1;//always checks  reference to latest object 
		System.out.println("----------------");
		System.out.println(u1.name + " " + u1.age+" "+u1.city);;
		System.out.println(u2.name + " " + u2.age+" "+u2.city);
		System.out.println(u3.name + " " + u3.age+" "+u3.city);
		
		u1=u3;
		System.out.println("--------------------");
		System.out.println(u1.name + " " + u1.age+" "+u1.city);;
		System.out.println(u2.name + " " + u2.age+" "+u2.city);
		System.out.println(u3.name + " " + u3.age+" "+u3.city);
		
		//c1=c2; c2=c3; c3=c4; c4=c1
		
		

	}

}
