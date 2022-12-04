 package javasessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> markList = new ArrayList<Integer>();
		System.out.println(markList.size());
		
		markList.add(100);//0
		markList.add(200);//1
		markList.add(11);//2
		markList.add(20);//3
		
		System.out.println(markList.get(2));
		
		markList.remove(2);
		
		System.out.println(markList.get(2));
		
		markList.add(400);
		
		System.out.println(markList.get(3));
		
		markList.add(0, 150);
		System.out.println(markList.get(0));
		
//		markList.add(7, 1000);
//		System.out.println(markList.get(7));//IOB always continues memory allocation
		//continuous memory allocation provides optimization of execution
		
		
		// 7. Write a Java program to reverse elements in a array list
		
		ArrayList<Object> reverse = new ArrayList<Object>();
		
		reverse.add('k');
		reverse.add('a');
		reverse.add('n');
		reverse.add('c');
		reverse.add('h');
		reverse.add('a');
		reverse.add('n');
		
		
		for(int k =reverse.size()-1;k>=0;k--) {
			reverse.add(reverse.get(k));
			System.out.println(reverse.get(k));
			
		}
		
		int a = 10;
		int b = 20;
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a);
		System.out.println(b);
		
		ArrayList<Integer> trimVC = new ArrayList<Integer>();
		trimVC.add(1);
		trimVC.add(2);
		trimVC.add(3);
		System.out.println("---before----");
		System.out.println(trimVC.size());
		trimVC.trimToSize();
		System.out.println("---after---");
		System.out.println(trimVC.size());
		
		for(int l=0;l<trimVC.size();l++)
		{
			System.out.println("for index "+l+" value is : "+trimVC.get(l));
		}
		/*Question 1: Write a program to print the following pattern using for loop:


		                        00 01 02 03 04 05 06 07 08 09 
		                        10 11 12 13 14 15 16 17 18 19 
		                        20 21 22 23 24 25 26 27 28 29 
		                        30 31 32 33 34 35 36 37 38 39
		        */
		
		for(int m=0; m<4;m++) {
			for(int n = 0;n<=9;n++) {
				System.out.print(m);
				System.out.print(n);
				System.out.print(" ");
			}
			System.out.println(" ");
			}
		//Question 2: Write a program to create a static Array, having following cricket data:
		//--name, age, team name, DOB, gender, Strike Rate
		//--Try to create multiple Object Arrays for different players 
		//--Try to print all the values of each player on the console
		
		Object cricketPlayer1[]= new Object[6];
		cricketPlayer1[0]= "Sam";
		cricketPlayer1[1]=25;
		cricketPlayer1[2]="royal";
		cricketPlayer1[3]= "03/05/1987";
		cricketPlayer1[4]= 'M';
		cricketPlayer1[5]= 7;
		
		Object cricketPlayer2[]= new Object[6];
		cricketPlayer2[0]= "Paul";
		cricketPlayer2[1]=25;
		cricketPlayer2[2]="splender";
		cricketPlayer2[3]= "11/01/1987";
		cricketPlayer2[4]= 'M';
		cricketPlayer2[5]= 10;
		
		
		Object cricketPlayer3[]= new Object[6];
		cricketPlayer3[0]= "Rocky";
		cricketPlayer3[1]=26;
		cricketPlayer3[2]="Gem";
		cricketPlayer3[3]= "11/01/1986";
		cricketPlayer3[4]= 'M';
		cricketPlayer3[5]= 8;
		
		for(int i =0; i<cricketPlayer1.length;i++) {
			System.out.println(cricketPlayer1[i]);
		}
		
		/*Question 3: Try to print the following pattern on the console:
		                        n = 4
		                        n = 3
		                        n = 2
		                        n = 1
		                        n = 0*/
		int pattern[] = new int[5];
		pattern[0]=0;
		pattern[1]=1;
		pattern[2]=2;
		pattern[3]=3;
		pattern[4]=4;
		
		for(int k =pattern.length-1;k>=0;k--) {
			System.out.println("n = "+pattern[k]);
		}
		
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		ar.add(1);
		ar.add(20);
		ar.add(19);
		//System.out.println(ar);
		
		Collections.sort(ar);
		System.out.println(ar);
		System.out.println("min value: "+ ar.get(0));
		System.out.println("max value: "+ ar.get(ar.size()-1));
		
		Collections.sort(ar, Collections.reverseOrder());
		System.out.println("--sort with reverse order----");
		System.out.println(ar);
		
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(2);
		ar1.add(13);
		ar1.add(220);
		ar1.add(119);
		System.out.println(ar1);
		
		ar1.addAll(ar);
		System.out.println(ar1);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Tom");//0
		names.add("Peter");//1
		names.add("Lisa");//2
		names.add("Ravi");//3
		
		System.out.println(names);
		
		Collections.swap(names, 10, 2);
		System.out.println(names);
		
		names.clear();
		System.out.println(names);
		
		
	}
	}
			
