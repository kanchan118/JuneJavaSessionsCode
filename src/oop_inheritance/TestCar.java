package oop_inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		final int i = 10;//constant data
		
		final int days = 7;
		//days = 10;
		System.out.println(10 * days);//70 USD
		
		
		
				
		BMW b = new BMW();
		
		b.start();//overridden method
		b.stop();//inherited method
		b.refuel();//inherited		
		b.autoParking();//individual
		b.engine();//overridden		
		System.out.println(b.speed);
		b.lawOfPhysics();
		
		//Car.wheels = 10;
		
		System.out.println(Car.wheels);
		
		System.out.println(BMW.wheels);//static variable can be inherited
		
		System.out.println("----------------");
		Car c1 = new Car();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();		
		
		
		Vehicle v4 = new Vehicle();
		v4.engine();
		

		//Child object can be referred by parent class ref variable
		//top/up casting:
		System.out.println("----------------");
		Car c = new BMW();
		c.start();
		c.stop();
		
		
		Vehicle v1 = new BMW();		
		v1.engine();//ref type check will fail when v1 tries to access child methods
		
		Vehicle v2 = new Car();
		v2.engine();
		
		
		//Down casting: run time will get exception ..compilation will pass
		//parent class object can be referred by child class object
		//BMW b1 = (BMW)new Car();//ClassCastException
		
		//BMW b2 = (BMW)new Vehicle();//ClassCastException
		
		
		

	}

}
