package day.one;

import java.util.ArrayList;

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

	public static void main(String[] args) {

		System.out.println("(Ans.-5.)" + getStringUpperCase("This is a String"));
		System.out.println(getIndex("This is a String"));

	}

}
