package Strings;

import java.util.ArrayList;

// Input:
// Java Selenium Testing Automation

// Output:
// avaJ Selenium gnitseT Automation
// Word Count = 4

class UsingForLoopReverseAlternateWordsAndCountWords {
    public static void UsingForLoopReverseAlternateWordsAndCountWordsMethods(String str) {
        String words[] = str.split(" ");

        String reverseString = "";
        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                for (int j = words[i].length() - 1; j >= 0; j--) {
                    reverseString = reverseString + words[i].charAt(j);
                }
                reverseString = reverseString + " ";
            } else {
                reverseString = reverseString + words[i];
            }
            reverseString = reverseString + " ";
        }

        System.out.println(reverseString);

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            count++;
        }
        System.out.println("Word Count = " + count);
    }
}

class UsingStringBuilderReverseAlternateWordsAndCountWords {
    public static void UsingStringBuilderReverseAlternateWordsAndCountWordsMethods(String str) {

        String words[] = str.split(" ");
        String reverseString = "";
        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                reverseString = reverseString + new StringBuilder(words[i]).reverse();
            }

            else {
                reverseString = reverseString + words[i];
            }
            reverseString = reverseString + " ";
        }

        System.out.println(reverseString);
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            count++;
        }
        System.out.println("Word Count = " + count);
    }
}

class UsingArrayListReverseAlternateWordsAndCountWords {
    public static void UsingArrayListReverseAlternateWordsAndCountWordsMethods(String str) {

        ArrayList<String> list = new ArrayList<>();
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }

        String reverseString = "";
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                for (int j = list.get(i).length() - 1; j >= 0; j--) {
                    reverseString = reverseString + list.get(i).charAt(j);
                }
            } else {
                reverseString = reverseString + list.get(i);
            }
            reverseString = reverseString + " ";
        }
        System.out.println(reverseString);

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            count++;
        }
        System.out.println("Word Count = " + count);
    }
}

public class ReverseAlternateWordsAndCountWords {
    public static void main(String[] args) {
        UsingForLoopReverseAlternateWordsAndCountWords
                .UsingForLoopReverseAlternateWordsAndCountWordsMethods("Java Selenium Testing Automation");
        UsingStringBuilderReverseAlternateWordsAndCountWords
                .UsingStringBuilderReverseAlternateWordsAndCountWordsMethods(
                        "Java Selenium Testing Automation Programming");
        UsingArrayListReverseAlternateWordsAndCountWords
                .UsingArrayListReverseAlternateWordsAndCountWordsMethods(
                        "Java Selenium Testing Automation Programming Learning");
    }
}
