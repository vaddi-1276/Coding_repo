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
        String finalvalue = "";

        for (int i = 0; i < words.length; i++) {

            if (i % 2 == 0) {
                for (int j = words[i].length() - 1; j >= 0; j--) {
                    finalvalue = finalvalue + words[i].charAt(j);
                }
                finalvalue = finalvalue + " ";
            } else {
                finalvalue = finalvalue + words[i];
            }
            finalvalue = finalvalue + " ";
        }
        System.out.println(finalvalue);
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            count++;
        }
        System.out.println("Count = " + count);
    }
}

class UsingStringBuilderReverseAlternateWordsAndCountWords {
    public static void UsingStringBuilderReverseAlternateWordsAndCountWordsMethods(String str) {

        String words[] = str.split(" ");
        String finalvalue = "";

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                finalvalue = finalvalue + new StringBuilder(words[i]).reverse();
            } else {
                finalvalue = finalvalue + words[i];
            }

            finalvalue = finalvalue + " ";
        }

        System.out.println(finalvalue);
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            count++;
        }
        System.out.println("Count = " + count);
    }
}

class UsingArrayListReverseAlternateWordsAndCountWords {
    public static void UsingArrayListReverseAlternateWordsAndCountWordsMethods(String str) {

        ArrayList<String> list = new ArrayList<>();
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                result.append(new StringBuilder(words[i]).reverse());
            } else {
                result.append(words[i]);
            }

            result.append(" ");
        }
        System.out.println(result);
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            count++;
        }
        System.out.println("Count = "+count);
    }
}

public class ReverseAlternateWordsAndCountWords {
    public static void main(String[] args) {
        UsingForLoopReverseAlternateWordsAndCountWords
                .UsingForLoopReverseAlternateWordsAndCountWordsMethods("Java Selenium Testing Automation");
        UsingStringBuilderReverseAlternateWordsAndCountWords
                .UsingStringBuilderReverseAlternateWordsAndCountWordsMethods("Java Selenium Testing Automation");
        UsingArrayListReverseAlternateWordsAndCountWords
                .UsingArrayListReverseAlternateWordsAndCountWordsMethods("Java Selenium Testing Automation");
    }
}
