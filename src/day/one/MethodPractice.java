package day.one;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodPractice {

	// 5. Write a Method that take one String input and return same string in upper case.

	public static String getStringUpperCase(String text) {
		String upperCase = null;
		upperCase = text.toUpperCase();
		return upperCase;
	}

	// 7. Write a method that take one String input and return a list off all index.

	public static ArrayList<Integer> getIndex(String text) {
		ArrayList<Integer> allIndex = new ArrayList<Integer>();

		for (int i = 0; i <= text.length(); i++) {
			allIndex.add(i);
		}
		return allIndex;
	}

	// 8. Write a method that take one String input and return a list of all character

	public static ArrayList<Character> getCharacterList(String text) {
		ArrayList<Character> allCharacter = new ArrayList<Character>();

		for (int i = 0; i < text.length(); i++) {
			allCharacter.add(text.charAt(i));
		}
		return allCharacter;
	}

	// 9.Write a method that take one number input and return the sum of 1 to that given number.

	public static int getSum(int number) {
		int total = 0;
		for (int i = 0; i <= number; i++) {
			total = total + i;
		}
		return total;
	}
//10 Write a method that take one number input and return square of the given number
	
	public static int getSquareNumber( int number){
		int squareTotal = 0;
		squareTotal = number*number;
		return squareTotal;
	}
	
	// 11. Write a method taht take one number input and return an array that contain 0 to given number
	
	public static int[] getNumberArray(int number){
		int[]numArray = new int[number+1];
		for(int i=0; i<=number; i++){
			numArray[i]=i;
		}
		return numArray;
	}
	
	public static void main(String[] args) {

		System.out.println("(Ans.-5.)" + getStringUpperCase("This is a String"));
		System.out.println("Ans.-7.)" + getIndex("This is a String"));
		System.out.println("Ans.-8.)" + getCharacterList("This is a String"));
		System.out.println("Ans.-9.) " + getSum(20));
		System.out.println("Ans.-10.) " + getSquareNumber(20));
		System.out.println("Ans.-11.) " + Arrays.toString(getNumberArray(10)));
	}

}
