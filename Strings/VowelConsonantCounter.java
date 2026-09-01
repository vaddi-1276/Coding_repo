package Strings;

import java.util.ArrayList;

// Input:
// automation

// Output:
// Vowels = 6
// Consonants = 4

class VowelConsonantUsingLoop {
    public static void countUsingLoop(String str) {
        int countofVowels = 0;
        int countofConsants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                countofVowels++;
            }

            else if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e'
                    && ch != 'i' && ch != 'o' && ch != 'u') {
                countofConsants++;
            }
        }
        System.out.println("Count of Vowels = " + countofVowels);
        System.out.println("Count of Consants = " + countofConsants);
    }
}

class VowelConsonantUsingArrayList {
    public static void countUsingArrayList(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        int countofVowels = 0;
        int countofConsants = 0;
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                countofVowels++;
            } else if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e'
                    && ch != 'i' && ch != 'o' && ch != 'u') {
                countofConsants++;
            }
        }
        System.out.println("Count of Vowels = " + countofVowels);
        System.out.println("Count of Consants = " + countofConsants);
    }
}

public class VowelConsonantCounter {
    public static void main(String[] args) {
        VowelConsonantUsingLoop.countUsingLoop("automation");
        VowelConsonantUsingArrayList.countUsingArrayList("abcdefghijklmnopqrstuvwxyz");
    }
}
