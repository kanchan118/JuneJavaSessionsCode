package javasessions;

public class Employee {
	
	//data members: class vars and methods
	
	//cannot create a method inside a method
	//methods are independent or parallel to each other
	
	//1. no input and no return:
	//void -- does not return anything
	public void test() {
		System.out.println("test method");
		
	}
	
	//2. no input and some return:
	//return type: String
	public String getName() {
		System.out.println("get name method");
		String n = "Tom";
		return n;
	}
	
	//
	public int add() {
		System.out.println("add number");
		int a = 100;
		int b = 200;
		int c = a+b;
		return c;
//		return b;//more than on return statement is not allowed
	}
	
	//3. some input and some return
	public int sum(int x, int y) {
		System.out.println("sum method");
		int total = x+y;
		return total;
	}
	
	//WAF: getMarks --> input param: studentName(String)
	//return the student marks
	//if st name is not found --- return ??
	public int getMarks(String studentName) {
				
		System.out.println("getting student marks for : "+ studentName);
		int marks = -1;
		
		if(studentName.equals("Tom")) {
//			return 90;
			marks =90;
		}
		else if(studentName.equals("Ravi")) {
//			return 95;
			marks=95;
		}else if(studentName.equals("Ahmed")) {
//			return 100;
			marks = 100;
		}
		else {
			System.out.println("student name is not found..."+studentName);
//			return -1;
			//marks = -1;
		}
		
		return marks;
	}
	
	
	

	public static void main(String[] args) {		
			
		Employee emp = new Employee();
		emp.test();
		String name = emp.getName();
		System.out.println(name);
		 
		//
//		System.out.println(emp.getName());
		
		int s = emp.add();
		System.out.println(s);
		
		int sum = emp.sum(10, 20);//10 and 20 are actual value of parameters ..called argument
		System.out.println(sum);
		
		int marks = emp.getMarks("Naveen");
		System.out.println(marks);
		
		
	}

}
