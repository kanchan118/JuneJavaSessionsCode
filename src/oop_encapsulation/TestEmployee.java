package oop_encapsulation;

public class TestEmployee {

	public static void main(String[] args) {

//		Employee e1 = new Employee();
//		e1.setName("Tom");
//		e1.setAge(20);
//		e1.setPerm(true);
//		
//		System.out.println(e1.getName());
//		System.out.println(e1.getAge());
//		System.out.println(e1.isPerm());

		// CRUD

		Employee e1 = new Employee("Tom", 20, true);// POST - create

		// GET - retrieve
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.isPerm());

		e1.setAge(25); // PUT - update

		// GET
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.isPerm());

		e1.setPerm(false);

		// GET
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.isPerm());

	}

}
