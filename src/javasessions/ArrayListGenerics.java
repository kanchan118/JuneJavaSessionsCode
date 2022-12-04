package javasessions;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {

		//ArrayList with Generics:
		
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		
		marksList.add(100);
		marksList.add(200);
		
		ArrayList<Double> bmiList = new ArrayList<Double>();
		
		bmiList.add(12.33);
		bmiList.add(100.00);//cannot add 100 as well , it will throw 
							//error for ArrayList
		
		
		ArrayList<String> empNamesList = new ArrayList<String>();
		
		empNamesList.add("Tom");//0
		empNamesList.add("Lokesh");//2
		empNamesList.add("Archana");//3
		empNamesList.add("100");//4

		System.out.println(empNamesList.size());//4
		
		//for index:
		for(int i = 0; i<empNamesList.size();i++)
		{
			System.out.println(empNamesList.get(i));
		}
		
		System.out.println("------------");
		
		//for each:
		for(String e : empNamesList) {
			System.out.println(e);
		}
		
		//AC:
		//design a list of employee data:
		//name(String), age(int), salary(double), isPerm(boolean),gender(char)
		
		System.out.println("---------------");
		
		ArrayList<Object> empData = new ArrayList<Object>();
		
		empData.add("Aarthi");
		empData.add(25);
		empData.add(23.44);
		empData.add(true);
		empData.add('f');
		
		for(Object e : empData) {
			System.out.println(e);
		}
		
		//print empData values in reverse order
		
		System.out.println("--reverse order ------");
		
		for(int j =empData.size()-1 ; j>=0;j--) {
			System.out.println(empData.get(j));
		}
		
		
		
		

	}

}
