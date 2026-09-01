package Strings;

import java.util.ArrayList;

// Input:
// Java Selenium Automation Testing

// Output:
// Selenium

class UsingTempVariableForSecondLargestWord {
    public static void UsingTempVariableForSecondLargestWordMethods(String str) {

        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {

            for (int j = i + 1; j < words.length; j++) {

                if (words[i].length() > words[j].length()) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.println("First Largest Word Length " + words[words.length - 1].length());
        System.out.println("First Largest Word  " + words[words.length - 1]);

        System.out.println("Second Largest Word Length " + words[words.length - 2].length());
        System.out.println("Second Largest Word  " + words[words.length - 2]);
    }
}

class UsingTwoVariablesForSecondLargestWord {
    public static void UsingTwoVariablesForSecondLargestWordMethods(String str) {

        String words[] = str.split(" ");
        String firstlargestword = words[0];
        String secondlargestword = words[0];

        int firstlargestwordlength = Integer.MIN_VALUE;
        int secondlargestwordlength = Integer.MIN_VALUE;

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > firstlargestwordlength) {
                secondlargestwordlength = firstlargestwordlength;
                secondlargestword = firstlargestword;

                firstlargestwordlength = words[i].length();
                firstlargestword = words[i];
            }

            else if (words[i].length() > secondlargestwordlength) {
                secondlargestwordlength = words[i].length();
                secondlargestword = words[i];
            }
        }

        System.out.println("First Largest Word Length " + firstlargestwordlength);
        System.out.println("First Largest Word " + firstlargestword);

        System.out.println("Second Largest Word Length " + secondlargestwordlength);
        System.out.println("First Largest Word " + secondlargestword);
    }
}

class UsingArrayListForSecondLargestWord {
    public static void UsingArrayListForSecondLargestWordMethods(String str) {
        ArrayList<String> list = new ArrayList<>();
        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }

        String firstlargestword = words[0];
        String secondlargestword = words[0];

        int firstlargestwordlength = Integer.MIN_VALUE;
        int secondlargestwordlength = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > firstlargestwordlength) {
                secondlargestwordlength = firstlargestwordlength;
                secondlargestword = firstlargestword;

                firstlargestwordlength = words[i].length();
                firstlargestword = words[i];
            }

            else if (list.get(i).length() > secondlargestwordlength) {
                secondlargestwordlength = words[i].length();
                secondlargestword = words[i];
            }
        }
        System.out.println("First Largest Word Length " + firstlargestwordlength);
        System.out.println("First Largest Word " + firstlargestword);

        System.out.println("Second Largest Word Length " + secondlargestwordlength);
        System.out.println("Second Largest Word " + secondlargestword);
    }
}

public class SecondLargestWord {
    public static void main(String[] args) {
        UsingTempVariableForSecondLargestWord
                .UsingTempVariableForSecondLargestWordMethods("Java Selenium Automation Testing");
        UsingTwoVariablesForSecondLargestWord
                .UsingTwoVariablesForSecondLargestWordMethods("Java Selenium Automation Testing");
        UsingArrayListForSecondLargestWord
                .UsingArrayListForSecondLargestWordMethods("Java Selenium Automation Testing");
    }
}
