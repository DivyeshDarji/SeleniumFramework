package javaPrograms;

import java.util.Scanner;

public class javaCamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the String in Camel Case: ");
		String inputString = input.nextLine();

		StringBuilder newString = new StringBuilder();

		camelconvert(inputString, newString);

	}

	private static void camelconvert(String inputString, StringBuilder newString) {
		// TODO Auto-generated method stub

		int length = inputString.length();

		for (int i = 0; i < length; i++) {

			char ch = inputString.charAt(i);
			if (Character.isLowerCase(ch)) {
				newString.append(Character.toUpperCase(ch));
			} else {
				newString.append(Character.toLowerCase(ch));
			}

		}

		System.out.println("Original String: " + inputString);
		System.out.println("Changed String: " + newString);

	}

}
