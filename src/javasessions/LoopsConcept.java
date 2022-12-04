package javasessions;

import java.lang.reflect.Array;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1 to 10:
		//1. while loop:
		
		int i = 1;
		
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		//0 to 10 : 0 2 4 6 8 10 -- even numbers
		//1 to 10 : 1 3 5 7 9 --odd numbers
		int e =0;
		while(e<=10) {
			System.out.println(e);//0
			e = e+2;
		}
		
		int f =1;
		while(f<=10) {
			System.out.println(f);//0
			f = f+2;
		}
		
		System.out.println("-----------------");
		
		while(true) {
			System.out.println("....welcome to Kanch heaven ...");//0
			break;
		}
		
		System.out.println("-----------------");
		
		//1 to 100:
		//multiplication of 5 --> print hi...
		int k = 1;
		while(k<=100) {
			System.out.println(k);
			if(k%5==0) {
				System.out.println("hi");
			}
			if(k==50) {
				System.out.println("half century ........");
				//break;
			}
			k++;
		}
		
		
		
		//use cases of while loop:
		//when number of iterations are not fixed:
			//page loading time
			//number of web elements on the page
			//web table - pagination --> 1 2 3 4 5 ... next
		
		//use cases of for:
		//when number of iterations are fixed:
		// 5 elements --- fixed
		
		//do-while
		//for each		
		
		System.out.println("-----------------");
		//2. for loop:
		//1 to 10:
//		int t =1;
//		for(;t<=10;) {
//			System.out.println(t);
//			t++;
//		}
		
		for(int t=1;t<=10;t++) {
			System.out.println(t);
			if(t==5) {
				break;
			}
		}
		
		//
//		for(;;){//in this case condition is defaulted to true hence
//			//infinite loop is generated
//			System.out.println("bye");
//		}
		
		for(byte b = 1;b<=10;b++) {
			System.out.println(b);
		}
		
		//10 to 1
				System.out.println("--------decrement---------");
				
				for (int a =10; a>=1;a--) {
					System.out.println(a);
					
				}
		
//				1. WAP to print following output:
//					 
//					I am Batman﻿
//					I am Batman﻿
//					I am Batman﻿
//					I am Batman
//					I am Batman
				
				for (int d=0;d<=4;d++)
				{
					System.out.println("I am Batman");
				}
				
//				2. WAP to print following output:
//					I am Batman 1
//					I am Batman 2
//					I am Batman 3
//					I am Batman 4
//					I am Batman 5
//					I am Batman 6
//					I am Batman 7
//					I am Batman 8
//					I am Batman 9
				for(int d1=0; d1<=9;d1++) {
					
					System.out.println("I am Batman "+d1);
				}
					
//				3. WAP to print 10 to 1 using for, while and do-while loop
				
				int m = 10;
				while (m>=1) {
					System.out.println(m);
					m--;
				}
				
				System.out.println("do while return");
				int n = 10;
				do {
					System.out.println(n);
					n--;
				} while (n>=1);
				
//				4. Write a program in Java to print "Hello World" ten times using while loop	
				
				int n1 = 10;
				while (n1>=1) {
					System.out.println("Hello world");
					n1--;
				}
				
//				5. Write a program in Java to print 1 to 10 using while loop
				int n2 = 1;
				while (n2<=10) {
					System.out.println(n2);
					n2++;
				}
				
//				6. WAP to find out the max number from the given positive numbers
				
//				int array[];
//				array = new int[]{1,5,2,8};				
//				for(int j =0; j<array.length-1;j++) {
//					
//					if(array[j]>array[j+1]) {
//						array[j+1]= array[j];	//j = 1											
//					}
//					System.out.println(array[j+1]);
//				}
				
				int a1 = 90; 
				int b1 = 15;
				int c1 = 20;
				
				if(a1>b1 & a1>c1)
				{
					System.out.println("The max number is "+a1);
				}else {
					if(b1>a1 & b1>c1) {
						System.out.println("The max number is "+b1);
					}else {
						System.out.println("The max number is "+c1);
					}
				}
				
//				7. print all odd and even numbers between 1 to 100
				
				for(int m2=1 ; m2<=100; m2++) {
					if(m2%2==0) {
						System.out.println("even # "+m2);
					}
					if(m2%2!=0) {
						System.out.println("odd # "+m2);
					}
				}
				
				
//				8. incremental / decremental is missing so infinite loop
				
//				int i1 = 1;
//				while(i1<=1){
//				System.out.println("Hi Java");
//				}

//				9.Print A-Z , a-z, 0-9 with the respective ASCII numbers on the console.
				
				char c2 = 'A';
				for(int v = 0; v<26;v++) {
					
					System.out.println("the ASCII value of "+c2+" is "+ (int)c2);
					c2++;
					
				}	
				
				System.out.println("---------a-z----------");
				char c3 = 'a';
				for(int v = 0; v<26;v++) {
					
					System.out.println("the ASCII value of "+c3+" is "+ (int)c3);
					c3++;
					
				}
				
				System.out.println("---------0-9----------");
				char c4 = '0';
				for(int v = 0; v<10;v++) {
					
					System.out.println("the ASCII value of "+c4+" is "+ (int)c4);
					c4++;
					
				}
				
//				10. Print this series: 
//				1.0 2.0 3.0  ...... 10.0 
				
				for(double d1 = 1; d1<=10;d1++) {
					System.out.println(d1);
				}
				
//				11. Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
				
				for(int l1=1;l1<=10;l1++) {
					System.out.println(l1);
					if(l1%7==0) {
						System.out.println("bye, see you tomorrow");
						break;
					}
				}
				
				int score = 100;
				while (score <= 100) {
					
					if(score == 0) {
						System.out.println("Zero - duck");
						break;
					}
					else if(score == 25) {
						System.out.println("good job");
						break;
					}else if(score == 50) {
						System.out.println("good job - half century");
						break;
					}else if(score==100) {
						System.out.println("good job - century");
						break;
					}
					
				}
				
		//do-while:
		//use cases:
		//during pagination validation we can use do 
		//to check the 1st page 
		//1 2 3 4 ...next page
		int p =1;
		do {
			//p++;
			System.out.println(p);
			p++;
		} while (p<=10);
		
		
				
				
				
				
				
				
				
				
				
				
				
	}

}
