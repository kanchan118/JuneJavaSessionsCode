package javasessions;

public class ForEachLoop {

	public static void main(String[] args) {

		int i[] = new int[4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		//1. index based for loop:
		for(int k = 0;k<i.length;k++) {
			System.out.println(i[k]);
		}
		System.out.println("----------------");
		
		//2. for each:
		//e is representing the value of array not index
		//java is taking care of the indexing
		//always incremental not decremental 
		for(int e : i) {
			System.out.println(e);
		}
		
		//2. double:
		double d[] = new double[3];
		d[0]=12.33;
		d[1]=23.44;
		d[2]=23.44;
		
		for(double e :d) {
			System.out.println(e);
		}		
		
		System.out.println("---------");
		//
		char c[] = new char[3];
		c[0] = 'a';
		c[1] ='b';
		c[2] ='$';
		
		for(char e:c) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
