package javaPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class javaHashmapDublicateWord {

	public static void main(String[] args) {
		
		String str="Bread Butter Bread Knife";
		
		
		HashMap<Integer,String> countWord = new HashMap<Integer, String>();
		
		countWord.put(1, "Bread");
		countWord.put(2, "Butter");
		countWord.put(3, "Bread");
		countWord.put(4, "Knife");
		
		System.out.println(countWord);
		
		System.out.println(countWord.size());
		
		int count = 0;
		for (Entry<Integer, String> entry : countWord.entrySet()) {
            if (entry.getValue().equals("Bread")) {
                System.out.println("Key for Bread : " + entry.getKey());
                count++;
            }
        }
		System.out.println("Count for Bread: " + count);
	}
	
	
	

}
