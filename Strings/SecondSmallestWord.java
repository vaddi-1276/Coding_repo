package Strings;

import java.util.ArrayList;

// Input:
// Java Selenium Automation Testing

// Output:
// Testing

class UsingTempVariableForSmallestLargestWord {
    public static void UsingTempVariableForSecondSmallestWordMethods(String str) {
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

        System.out.println("First Smallest Word Length using Temp Variable " + words[0].length());
        System.out.println("First Smallest Word using Temp Variable " + words[0]);

        System.out.println("Second Smallest Word Length using Temp Variable " + words[1].length());
        System.out.println("Second Smallest Word using Temp Variable " + words[1]);
    }
}

class UsingTwoVariablesForSecondSmallestWord {
    public static void UsingTwoVariablesForSecondSmallestWordMethods(String str) {

        String words[] = str.split(" ");
        String firstsmallestword = words[0];
        String secondsmallestword = words[1];

        int firstsmallestwordlength = Integer.MAX_VALUE;
        int secondsmallestwordlength = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < firstsmallestwordlength) {
                secondsmallestwordlength = firstsmallestwordlength;
                secondsmallestword = firstsmallestword;

                firstsmallestwordlength = words[i].length();
                firstsmallestword = words[i];
            }

            else if (words[i].length() < secondsmallestwordlength) {
                secondsmallestwordlength = words[i].length();
                secondsmallestword = words[i];
            }
        }

        System.out.println("First Smallest Word Length using Two Variable " + firstsmallestwordlength);
        System.out.println("First Smallest Word using Two Variable " + firstsmallestword);

        System.out.println("Second Smallest Word Length using Two Variable " + secondsmallestwordlength);
        System.out.println("Second Smallest Word using Two Variable " + secondsmallestword);
    }
}

class UsingArrayListForSecondSmallestWord {
    public static void UsingArrayListForSecondSmallestWordMethods(String str) {
        ArrayList<String> list = new ArrayList<>();
        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }

        String firstsmallestwordstring = words[0];
        String secondsmallestwordstring = words[0];

        int firstsmallestwordlength = Integer.MAX_VALUE;
        int secondsmallestwordlength = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++)

        {
            if (list.get(i).length() < firstsmallestwordlength) {
                secondsmallestwordlength = firstsmallestwordlength;
                secondsmallestwordstring = firstsmallestwordstring;

                firstsmallestwordlength = list.get(i).length();
                firstsmallestwordstring = list.get(i);
            }

            else if (list.get(i).length() < secondsmallestwordlength) {
                secondsmallestwordlength = list.get(i).length();
                secondsmallestwordstring = list.get(i);
            }
        }

        System.out.println("First Smallest Word Length using ArrayList " + firstsmallestwordlength);
        System.out.println("First Smallest Word using ArrayList " + firstsmallestwordstring);

        System.out.println("Second Smallest Word Length using ArrayList " + secondsmallestwordlength);
        System.out.println("Second Smallest Word using ArrayList " + secondsmallestwordstring);
    }
}

public class SecondSmallestWord {
    public static void main(String[] args) {
        UsingTempVariableForSmallestLargestWord
                .UsingTempVariableForSecondSmallestWordMethods("Java Selenium Automation Testing");
        UsingTwoVariablesForSecondSmallestWord
                .UsingTwoVariablesForSecondSmallestWordMethods("Java Selenium Automation Testing");
        UsingArrayListForSecondSmallestWord
                .UsingArrayListForSecondSmallestWordMethods("Java Selenium Automation Testing");
    }
}
