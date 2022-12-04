package javasessions;

/**
 * 
 * @author kanch Date: july 3rd 2022
 */

public class DataTypesConcept {

	public static void main(String[] args) {

		// data types:
		// strict data type
		// 1. primitive data types:
		// no need to create any object for primitive data types
		// a. boolean type: boolean(true/false)
		// b. Numeric type:
		// b.1: character type: char
		// b.2: Integral type:
		// b.2.1: Integer: byte, short, int , long
		// b.2.2: floating-point: float, double

		// 2. non primitive data types : class, String,array, interface, abs class

		// 1. byte:
		// size: 1 byte = 8 bits
		// range: -128 to +127
		byte b = 1;
		b = 10;
		System.out.println(b);

		byte b1 = -10;

		// 2. short:
		// size: 2 bytes = 16 bits
		// range: -32768 to 32767
		short s = 10000;
		System.out.println(s);
		short s1 = 1;
		System.out.println(s1);

		// 3. int:
		// size: 4 bytes = 32 bits
		// range: -2147483648 to 2147483647
		// -2^32 to 2^32-1
		int i = 122221;
		int p = 1;

		// 4. long :
		// size: 8 bytes = 64 bits
		// range: -2^64 to 2^64-1
		long num = 876799865;
		System.out.println(num);
		
		//floating-point
		//5. float:
		//size: 4 bytes = 32 bits
		float f = 12.33f;
		float f1 = (float)3.44;
		System.out.println(f);
		System.out.println(f1);
		float f2 =100;
		System.out.println(f2);
		
		//6. double:
		//size: 8 bytes = 64 bits
		double d = 12.33367;
		double d1 = -12.444;
		System.out.println(d);
		double d2 = 1.1;//prefer float as it will take less memory
		
		//7. char:
		//size : 2 bytes = 16 bits
		char c = 'a';//alphabetic character
		char c11 ='b';
		char c1 = '1';
		char c2 = '$';
		
		System.out.println(c);//a
		System.out.println(c+c11);//97+98 = 195 due to unicode or ASCII code
		System.out.println(c-c1);//-1
		System.out.println(c*c1);
		
		char t = '4';
		char t1='0';
		System.out.println(t+t1);//
		System.out.println(t1);
		
		//range:
		//a-z : 97 to 122
		//A-Z : 65 to 90
		//0-9 : 48 to 57
		
		System.out.println((int)c);
		System.out.println((int)'b');//b is value that's why single quotes
		
		char gender = 'f';
		char currency = '$';
		
		
		//8. boolean: true/false
		//size: ~1 bit
		boolean bl = true;
		boolean bl1 = false;
		
		System.out.println(bl);
		
		
	}

}
