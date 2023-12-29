package javaPrograms;

public class javaRemoveDuplicates {

    public static void main(String[] args) {
        String input = "I Llovee Yooouu Mittuu";

        System.out.println("Original String: " + input);
        System.out.println("Clear String: " + removeDuplicate(input));
    }

    private static String removeDuplicate(String input) {
        char[] ch = input.toCharArray();
        StringBuilder resultedString = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            resultedString.append(ch[i]);

            // checking next character is repeated
            if (i < ch.length - 1 && ch[i] == ch[i + 1]) {
                // if same, skip that character
                while (i < ch.length - 1 && ch[i] == ch[i + 1]) {
                    i++;
                }
            }
        }

        return resultedString.toString();
    }
}
