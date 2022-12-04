package javasessions;

public class ArraysConcept {

	public static void main(String[] args) {
		
		//arrays:
		//limitations of array:
		//1. similar type of data only:
		//2. size is fixed : static array: to overcome this issue, we have to use 
		//dynamic array
		
		//advantage of static array:
		//better performance when size is fixed
		
		//1. int array:
		
		//a. using new keyword:
		
		int i[] = new int[4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[0]);
		System.out.println(i[3]);
//		System.out.println(i[4]);//ArrayIndexOutOfBoundsException
//		System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		//in python we have -ve indexing but not in Java
		
		
		//to print all the values from array: iterate this array:
		
		//for loop
		
		System.out.println(i.length);
		
		System.out.println("----------");
		
		for(int k =0; k<i.length; k++) {
			System.out.println(i[k]);
		}
		
		System.out.println("----------");
		
		//to print in reverse order :
		
		for(int l=i.length-1;l>=0;l--) {
			
			System.out.println(i[l]);
		}
		
		//2. double:
		double d[] = new double[2];
		d[0]=12.33;
		d[1]=23.44;
		System.out.println(d[0]);//default value will be 0.0
		
		System.out.println("----------");
		
		//3. char:
		char c[] = new char[3];
//		c[0] = 'a';
		c[1] ='b';
		c[2] ='$';
		System.out.println(c[0]+c[1]);//default value for char is space
		
		for(int g = 0; g<c.length;g++) {
			System.out.println(c[g]);
		}
		
		
		
		System.out.println("----------");
		
		byte b1 = 065;//when ever byte starts with 0 we calculate octa value 
		System.out.println(b1);
		//065 = (0*8^2)+(6*8^1)+(5*8^0)
		
		
//		int k[] = new int[5];
//		k[2] = 20;
//		System.out.println(k[1]);//0
//		//array stores default value of data type i.e. in this case integer
//		//so it will print 0
//		System.out.println(k[2]);//20
		
		
		
		
		
		
		
		
		
		
		

	}

}
