package javaPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class javaCountCharacterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter The String: ");
		
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		
		countCharacter(inputString);
		
	}

	private static void countCharacter(String inputString) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> data = new HashMap<String, Integer>();
		//data.put(Key, Value);
		
		char ch;
		for(int i=0;i<inputString.length();i++) {
			ch = inputString.charAt(i);
			System.out.println(ch);
		}
		
		
	}

}
