package day.one;


public class MethodPractice {

	// 5. Write a Method that take one String input and return same string in upper case.

	public static String getStringUpperCase(String text) {
		String upperCase = null;

		upperCase = text.toUpperCase();

		return upperCase;
	}

	public static void main(String[] args) {

		System.out.println("(Ans.-5.)" + getStringUpperCase("This is a String"));

	}

}
