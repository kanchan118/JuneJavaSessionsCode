package javasessions;

public class IncrementalAndDecremental {

	public static void main(String[] args) {
		
		//1. post increment:
		//++
		int m = 1;
		int n = m++;
		System.out.println(m);//2
		System.out.println(n);//1
		
		int total = 1;
		System.out.println(total++);//1
		System.out.println(total);//2
		
		//2. pre increment:
		int b = 1;
		int v = ++b;
		System.out.println(b);//2
		System.out.println(v);//2
		
		int tt = -89;
		int rr = ++tt;
		System.out.println(tt);//-88
		System.out.println(rr);//-88
		
		int pop = 100;
		System.out.println(++pop);
		System.out.println(pop);
		
		//3. post decrement:--
		int d = 2;
		int f = d--;
		System.out.println(d);//1
		System.out.println(f);//2
		
		int y = -99;
		int z = y--;
		System.out.println(y);//-100
		System.out.println(z);//-99
		
		int food=-89;
		System.out.println(food--);
		System.out.println(food);
		
		//4. pre decrement:
		int e = 2;
		int u = --e;
		System.out.println(e);//1
		System.out.println(u);//1
		
//		int bal = 500;
//		int totalBal = bal+++10;
//		System.out.println(totalBal);//510
//		System.out.println(bal);//501
		//
		int bal = 500;
		int totalBal = ++bal+10;
		System.out.println(totalBal);//511
		System.out.println(bal);//501
		

	}

}
