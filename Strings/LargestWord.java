package Strings;

import java.util.ArrayList;

// Input:
// Java Selenium Automation

// Output:
// Automation

class UsingTempVariableClass {
    public static void UsingTempVariableMethods(String str) {

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

        System.out.println(words[words.length - 1]);
    }
}

class UsingStoreVariableClass {

    public static void UsingStoreVariableMethods(String str) {

        String words[] = str.split(" ");
        String LargestWord = "";
        int LargestWordLength = Integer.MIN_VALUE;
        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > LargestWordLength) {
                LargestWordLength = words[i].length();
                LargestWord = words[i];

            }

        }
        System.out.println(LargestWord);
        System.out.println(LargestWordLength);
    }
}

class UsingArrayListForLargestWord {
    public static void UsingArrayListForLargestWordMethods(String str) {

        ArrayList<String> list = new ArrayList<>();
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }

        String LargestWord = words[0];
        int LargestWordLength = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > LargestWordLength) {
                LargestWord = list.get(i);
                LargestWordLength = list.get(i).length();
            }
        }
        System.out.println(LargestWord);
        System.out.println(LargestWordLength);
    }
}

public class LargestWord {
    public static void main(String[] args) {
        UsingTempVariableClass.UsingTempVariableMethods("Java Selenium Automation");
        UsingStoreVariableClass.UsingStoreVariableMethods("Java Selenium Automation");
        UsingArrayListForLargestWord
                .UsingArrayListForLargestWordMethods("Java Selenium Automation");
    }
}
