package day.one;
public class MethodPractice {

	// 6. Write a Method that take one String input and return same string in lower case.

	public static String getStringLowerCase(String text) {
		String lowerCase = null;

		lowerCase = text.toLowerCase();

		return lowerCase;
	}

	public static void main(String[] args) {

		System.out.println("(Ans.-6.)" + getStringLowerCase("This is a String"));

	}

}
