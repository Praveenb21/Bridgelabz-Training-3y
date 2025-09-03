package string;

import java.util.*;

public class VowelConsonantType {
    static String checkChar(char c) {
        char ch = Character.toLowerCase(c);
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) >= 0) return "Vowel";
            else return "Consonant";
        } else return "Not a Letter";
    }

    static String[][] classify(String s) {
        String[][] result = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            result[i][0] = String.valueOf(s.charAt(i));
            result[i][1] = checkChar(s.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String[][] result = classify(input);
        System.out.println("Char\tType");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}

