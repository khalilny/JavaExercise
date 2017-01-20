package day.one;
import java.util.ArrayList;
import java.util.Arrays;
public class MethodPractice {

	/** 1. Write a method that take your name input and return your name.
	 * Input/Parameter: string name return/output : String Serving
	 * Bucket/container:variable
	 */

	public static String getNewNameOne(String name) {
		String newName = "";
		newName = name;

		return newName;
	}

	/** 2. Write a method that take a number input and return the list of all
	 * even number from 0 to that given number. 
	 * Input/ Parameter: int number
	 * return/output type : ArrayList <Integer>
	 *  Serving Bucket/container: List
	 */

	public static ArrayList<Integer> getEvenNumber(int number) {
		ArrayList<Integer> evenNumberList = new ArrayList<Integer>();
		for (int i = 0; i <= number; i = i + 2) {
			evenNumberList.add(i);
		}

		return evenNumberList;
	}

	/** 3. Write a method that take a number input and return the list of all odd
	 * number from 0 to that given number
	 * Input/ parameter int number
	 * return/output type: ArrayList<Integer>
	 *  serving bucket/ container List.
	 */
	public static ArrayList<Integer> getOddNumber(int number) {
		ArrayList<Integer> oddNumber = new ArrayList<Integer>();
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 1) {
				oddNumber.add(i);
			}
		}

		return oddNumber;
	}

	/** 4.Write a method that take input as mile & return as kilometer.
	 *  Input/ Parameter: double number
	 *   return type:double
	 *    serving Bucket/container:variable
	 */
	public static double getKilometer(double number) {
		double asKilometer = 0;
		asKilometer = number * 1.6;

		return asKilometer;
	}

	// 5. Write a Method that take one String input and return same string in upper case.

	public static String getStringUpperCase(String text) {
		String upperCase = null;
		upperCase = text.toUpperCase();

		return upperCase;
	}

	// 6. Write a method that take one String input and return Same String in lower case.

	public static String getStringLowerCase(String text) {
		String lowerCase = null;
		lowerCase = text.toLowerCase();

		return lowerCase;
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
	// 10 Write a method that take one number input and return square of the given number

	public static int getSquareNumber(int number) {
		int squareTotal = 0;
		squareTotal = number * number;
		return squareTotal;
	}

	// 11. Write a method taht take one number input and return an array that
	// contain 0 to given number

	public static int[] getNumberArray(int number) {
		int[] numArray = new int[number + 1];
		for (int i = 0; i <= number; i++) {
			numArray[i] = i;
		}
		return numArray;
	}

	// 12. Write a method that take one number input and return a number list
	// starting from 0 to that given number

	public static ArrayList<Integer> getNumberList(int number) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for (int i = 0; i <= number; i++) {
			numberList.add(i);
		}
		return numberList;
	}

	// 13.Write a method that take one number input and return fizz if the given
	// number divided by 5 and return buzz if the given number divided by 5 && 3
	// otherwise return fizz buzz.

	public static String getName(int number) {
		String result = null;
		if (number % 5 == 0 && number % 3 == 0) {
			result = "Buzz";
		} else if (number % 5 == 0) {
			result = "Fizz";
		} else {
			result = "FizzBuzz";
		}

		return result;

	}
	// 14.1.Write a method that take one number Array input and return the max number.
	
		public static int getMaxNumber(int[] numberArray){
		int maximumNumber =0;
			Arrays.sort(numberArray);
			maximumNumber= numberArray[numberArray.length-1];
			
			return maximumNumber;
		}

	// 14.2 write a method that take one number array input and return the max
		// number.

		public static int getMaxNumberTwo(int[] numArray1) {
			int maxNumber = numArray1[0];
			for (int i = 0; i < numArray1.length; i++) {
				if (maxNumber < numArray1[i]) {
					maxNumber = numArray1[i];
				}
			}

			return maxNumber;
		}
	/**15.1 Write a method that take one number Array input and return the
	  min number.
	  *Input parameter : int []numAraay ReturnType : int serving
	 * Bucket/container : variable
	 */
	public static int getMinNumber(int[] numArrayTwo) {
		int minimumNumber = 0;
		Arrays.sort(numArrayTwo);
		minimumNumber = numArrayTwo[0];
		return minimumNumber;

	}
	/**15.2. 15, Write a method that take one number Array input and return the
	 * min number.
	 * Input parameter : int []numAraay ReturnType : int serving
	 * Bucket/container : variable
	 */

	public static int getMinNumber2(int[] numArray2) {
		int minimumNumber = numArray2[0];
		for (int i = 0; i < numArray2.length; i++) {
			if (minimumNumber > numArray2[i]) {
				minimumNumber = numArray2[i];
			}
		}

		return minimumNumber;
	}
	
	/** 16.Write a Method that take a number input and return the same value as a String
	 * input/ parameter: int number
	 * return type:String
	 * Serving Bucket: 
	 */
	
	public static String getStringFromInteger(int number){
		String convertedNumber= null;
		convertedNumber= String.valueOf(number);
		
		return convertedNumber;
	}
	/**17. Write a method that take a string representation of number input and
	 * return the same value as an integer.
	 * Input/ parameter: String name
	 * Return Type : int.
	 * serving Bucket: Variable
	 * 
	 */
	public static int getIntegerFromString(String name){
		int rollNumber = 0;
		rollNumber = Integer.valueOf(name);
		
		return rollNumber;
	}
	
	/** 18, Write a method that take String input & return true if it contains
	 * char 'a" otherwise return false.
	 * input/ parameter:String text 
	 * Return type :boolean 
	 * serving bucket variable
	 */
	
	public static boolean getDecision(String text){
		boolean decision = false;
		for(int i=0;i<text.length();i++){
			if(text.charAt(i)=='a'|| text.charAt(i)=='A'){
				decision = true;
			}
		}
		
		return decision;
	}
	
	/**19.write a method that take a one String input and return the sum of all index. 
	 * input/ parameter: String text 
	 * Return type: int 
	 * Serving bucket :Variable
	 */
	public static int getSumOfAllindex(String text){
		int indexTotal=0;
		for(int i=0; i<text.length();i++){
			indexTotal= indexTotal+i;
		}
		
		return indexTotal;
	}
	/** 20, Write a method that take one string input and return a list of last five character. 
	 * input/parameter: String name;
	 * Return type: Arraylist<Character>;
	 * Serving bucket: list
	 */
	public static ArrayList<Character> getCharacterListLast(String text){
		ArrayList<Character>lastFiveCharacter = new ArrayList<Character>();
		for(int i=text.length()-5; i<text.length();i++){
			lastFiveCharacter.add(text.charAt(i));
		}
		
		return lastFiveCharacter;
	}
	
	public static void main(String[] args) {
		System.out.println("Ans.-20.) "+getCharacterListLast("This is a String"));
		System.out.println("Ans.-19.) "+getSumOfAllindex("This is a String"));
		System.out.println("Ans.-18.) "+getDecision("This is a String"));
		System.out.println("Ans.-17.) "+getIntegerFromString("30"));
		System.out.println("Ans.-16.) " + getStringFromInteger(20));
		int[] numArray2 = { 18, 40, -50, 70, 3 };
		System.out.println("Ans.-15.2)" + getMinNumber2(numArray2));
		int[] numArray = { 18, 40, -50, 70, 3 };
		System.out.println("Ans.-15.1)" + getMinNumber(numArray));
		int[] numArray1 = { 18, 17, 39, 38, 35 };
		System.out.println("Ans.-14.2)" + getMaxNumberTwo(numArray1));
		int[]numberArray = {10,12,15,38,20};
		System.out.println("Ans.-14.1) " + getMaxNumber(numberArray));
		System.out.println("Ans.-13.) " + getName(20));
		System.out.println("Ans.-12.) " + getNumberList(10));
		System.out.println("Ans.-11.) " + Arrays.toString(getNumberArray(10)));
		System.out.println("Ans.-10.) " + getSquareNumber(20));
		System.out.println("Ans.-9.) " + getSum(20));
		System.out.println("Ans.-8.) " + getCharacterList("This is a String"));
		System.out.println("Ans.-7.) " + getIndex("This is a String"));
		System.out.println("Ans.-6.) " + getStringLowerCase("This is a String"));
		System.out.println("Ans.-5.) " + getStringUpperCase("This is a String"));
		System.out.println("Ans.-4.) " + getKilometer(3));
		System.out.println("Ans.-3.) " + getOddNumber(20));
		System.out.println("Ans.-2.) " + getEvenNumber(20));
		System.out.println("Ans.-1.) " + getNewNameOne("Rafique"));

	}

}
