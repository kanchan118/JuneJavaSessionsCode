package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;

public class TryCatchBlock {

	String name;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		//Thread.sleep(4000);
		
//		File file = new File("test.png");
//		FileInputStream ip = new FileInputStream(file);
		

		int a = 9;
		int b = 0;

		try {
			TryCatchBlock obj = new TryCatchBlock();
			//obj = null;
			obj.name = "naveen";//NPE

			int i = a / b;// AE
			System.out.println("hello");
			System.out.println("hello");
			System.out.println("hello");
			
		} catch (NullPointerException e) {
			System.out.println("NPE is coming...");
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		}

		System.out.println("bye");

	}

}
