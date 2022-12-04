package javasessions;

public class TypeCasting {

	public static void main(String[] args) {
		
		//TypeCasting:
			//1. widening TypeCasting:
		//Auto conversion of lower data types to higher types
		
		byte b = 2;
		short s = b;
		int i = b;
		long l = b;
		
		System.out.println(b);
		System.out.println(s);
		
		//2. Narrowing:
		//Conversion of higher data types to lower types:
		//it is not auto conversion
		int p = 100;
		short s1 = (short)p;
		byte b1 =(byte)p;
		
		byte m = 100;
		byte n = 114;
		int t1 =m+n;
		byte t = (byte)(m+n);
		System.out.println(t);
		System.out.println(t1);
		
		int j ='a';
		char c = 97;
		System.out.println(c);
		

	}

}
