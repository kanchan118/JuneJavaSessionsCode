package javasessions;

public class Practice {

	public static void main(String[] args) {

		// sort the array
		// array
		// compare and switch the elements

		int[] array = { 1, 6, 4, 8, 0, 3 };

		int temp = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for (int k = 0; k < array.length; k++) {
			System.out.println(array[k]);
		}
		
		//write script to reverse a string
		//variable 1 to store original String
		//variable 2 to store reverse String
		
		String name= "Kanchan";
		String reverse = "";
		char ch ;
		
		for(int i=name.length()-1; i>=0;i--) {
			ch = name.charAt(i);			
			reverse= reverse+ch;
			
		}
		
		System.out.println("The reverse of original string :" + name + " is : " + reverse);
	}
	
	
	

}
