package day.one;

import java.util.ArrayList;

public class MethodPractice {

	// Write a method that your name input and return your name.

	public static String getNewName(String name) {

		String myName = null;

		myName = name;

		return myName;
	}
	
	
	// Write a method that take one number input and return the list of all even number 
	
	
	public static ArrayList<Integer>getEvenNumberList(int number){
		ArrayList<Integer> evenNumber = new ArrayList<Integer>();
		
		for(int i= 0; i<=number;i++){
			
			
			if(i%2==0){
				
				
				evenNumber.add(i);
				
				
				
			}
			
		}
		
		
		
		return evenNumber;
		
	}
	
	
	
	
	

	public static void main(String[] args) {

		System.out.println(getNewName("ibrahim"));
		
		System.out.println(getEvenNumberList(20));
		

	}

}
