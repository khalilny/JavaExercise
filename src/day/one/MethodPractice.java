package day.one;

import java.util.ArrayList;

public class MethodPractice {

	// 1. Write a method that take your name input and return your name.

	public static String getNewName(String name) {

		String myName = null;

		myName = name;

		return myName;
	}

	// 2. Write a method that take one number input and return the list of all
	// even number

	public static ArrayList<Integer> getEvenNumberList(int number) {
		ArrayList<Integer> evenNumber = new ArrayList<Integer>();

		for (int i = 0; i <= number; i++) {

			if (i % 2 == 0) {

				evenNumber.add(i);

			}

		}

		return evenNumber;

	}

	// 3. Write a method that take a number input and return the list of
	// all odd number from 0 to that given number.

	public static ArrayList<Integer> getOddNumberList(int number) {

		ArrayList<Integer> oddNumberList = new ArrayList<Integer>();

		for (int i = 0; i <= number; i++) {

			if (i % 2 == 1) {

				oddNumberList.add(i);
			}
		}

		return oddNumberList;
	}

	// Write a method that take input as mile & return as kilometer

	public static double getKilometer(double number) {
		double asKilometer = 0;

		asKilometer = number * 1.6;

		return asKilometer;
	}

	public static void main(String[] args) {

		System.out.println("(Ans.-1.)" + getNewName("ibrahim"));

		System.out.println("(Ans.-2.)" + getEvenNumberList(20));

		System.out.println("(Ans.-3.)" + getOddNumberList(20));
		System.out.println(getKilometer(3));

	}

}
