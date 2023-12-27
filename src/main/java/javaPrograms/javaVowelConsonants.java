package javaPrograms;

import java.util.Scanner;

public class javaVowelConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the String for Vowel & Consonant Check: ");
		String inputString = input.nextLine();
		inputString = inputString.replaceAll("\\s", "");
		System.out.println("Trimmed String: " + inputString);

		checkVowel(inputString);
		checkSpecialCharacter(inputString);

	}

	private static void checkSpecialCharacter(String inputString) {
		// TODO Auto-generated method stub
		int length = inputString.length();

		for (int i = 0; i < length; i++) {
			char ch = inputString.charAt(i);
			if (!Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isWhitespace(ch)) {
				System.out.println("Speical Character: " + ch);
			}
		}
		

	}

	private static void checkVowel(String inputString) {
		// TODO Auto-generated method stub

		int length = inputString.length();
		System.out.println("Length: " + length);
		int vowelCount = 0;

		for (int i = 0; i < length; i++) {
			char ch = Character.toLowerCase(inputString.charAt(i));

			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelCount++;
				break;

			default:
				break;
			}
		}

		System.out.println("Vowel Count: " + vowelCount);
		//System.out.println("Consonant Count: " + (length - vowelCount));

	}

}
