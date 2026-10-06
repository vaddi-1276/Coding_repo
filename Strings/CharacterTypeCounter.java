package Strings;

import java.util.ArrayList;

// Input:
// Java123@#

// Output:
// Alphabets = 4
// Digits = 3
// Special Characters = 2

class CharacterTypeUsingLoop {
    public static void countUsingLoop(String str) {
        int countofalphabets = 0;
        int countofdigits = 0;
        int countofspecialcharacters = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                countofalphabets++;
            }

            else if (ch >= '0' && ch <= '9') {
                countofdigits++;
            }

            else if (!(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9')) {
                countofspecialcharacters++;
            }
        }

        System.out.println("Count of Alphabets = " + countofalphabets);
        System.out.println("Count of Digits = " + countofdigits);
        System.out.println("Count of Special Charcaters = " + countofspecialcharacters);
    }
}

class UsingRecursionCharacterTypeCounter {
    public static void UsingRecursionCharacterTypeCounterMethods(String str, int index, int countofalphabets,
            int countofdigits, int countofspecialcharacters) {

        if (index == str.length()) {
            System.out.println("Count of Alphabets = " + countofalphabets);
            System.out.println("Count of Digits = " + countofdigits);
            System.out.println("Count of Special Charcaters = " + countofspecialcharacters);
            return;
        }

        char ch = str.charAt(index);

        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            countofalphabets++;
        }

        else if (ch >= '0' && ch <= '9') {
            countofdigits++;
        }

        else if (!(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9')) {
            countofspecialcharacters++;
        }

        UsingRecursionCharacterTypeCounterMethods(str, index + 1, countofalphabets, countofdigits,
                countofspecialcharacters);
    }
}

class CharacterTypeUsingCharacterMethods {
    public static void countUsingCharacterMethods(String str) {

        int countofalphabetsCharacterType = 0;
        int countofdigitsCharacterType = 0;
        int countofspecialcharactersCharacterType = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                countofalphabetsCharacterType++;
            }

            else if (Character.isDigit(ch)) {
                countofdigitsCharacterType++;
            }

            else if (!(Character.isLetterOrDigit(ch))) {
                countofspecialcharactersCharacterType++;
            }
        }
        System.out.println("Alphabets = " + countofalphabetsCharacterType);
        System.out.println("Digits = " + countofdigitsCharacterType);
        System.out.println("Special Characters = " + countofspecialcharactersCharacterType);
    }
}

class CharacterTypeUsingArrayList {

    public static void countUsingArrayList(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        int countofalphabetsCharacterType = 0;
        int countofdigitsCharacterType = 0;
        int countofspecialcharactersCharacterType = 0;
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (Character.isLetter(ch)) {
                countofalphabetsCharacterType++;
            } else if (Character.isDigit(ch)) {
                countofdigitsCharacterType++;
            }

            else if (!(Character.isLetterOrDigit(ch))) {
                countofspecialcharactersCharacterType++;
            }
        }
        System.out.println("Alphabets = " + countofalphabetsCharacterType);
        System.out.println("Digits = " + countofdigitsCharacterType);
        System.out.println("Special Characters = " + countofspecialcharactersCharacterType);
    }
}

public class CharacterTypeCounter {
    public static void main(String[] args) {
        CharacterTypeUsingLoop.countUsingLoop("Java123@#");

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        UsingRecursionCharacterTypeCounter.UsingRecursionCharacterTypeCounterMethods("Java123@#", 0, 0, 0, 0);

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        // CharacterTypeUsingCharacterMethods.countUsingCharacterMethods("JAVA!@#$*(1234567");
        // CharacterTypeUsingArrayList.countUsingArrayList("JAVA!@#$*(1234567");
    }
}
