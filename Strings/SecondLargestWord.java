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

        System.out.println("First Smallest Word Length using Temp Variable " + words[words.length - 1].length());
        System.out.println("First Smallest Word using Temp Variable " + words[words.length - 1]);

        System.out.println("Second Smallest Word Length using Temp Variable " + words[words.length - 2].length());
        System.out.println("Second Smallest Word using Temp Variable " + words[words.length - 2]);
    }
}

class UsingTwoVariablesForSecondLargestWord {
    public static void UsingTwoVariablesForSecondLargestWordMethods(String str) {

        String words[] = str.split(" ");
        String firstlargestword = words[0];
        String secondlargestword = words[1];

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

        System.out.println("First Smallest Word Length using Two Variable " + firstlargestwordlength);
        System.out.println("First Smallest Word using Two Variable " + firstlargestword);

        System.out.println("Second Smallest Word Length using Two Variable " + secondlargestwordlength);
        System.out.println("Second Smallest Word using Two Variable " + secondlargestword);
    }
}

class UsingArrayListForSecondLargestWord {
    public static void UsingArrayListForSecondLargestWordMethods(String str) {
        ArrayList<String> list = new ArrayList<>();
        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }

        String firstlargestwordstring = words[0];
        String secondlargestwordstring = words[0];

        int firstlargestwordlength = Integer.MIN_VALUE;
        int secondlargestwordlength = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++)

        {
            if (list.get(i).length() > firstlargestwordlength) {
                secondlargestwordlength = firstlargestwordlength;
                secondlargestwordstring = firstlargestwordstring;

                firstlargestwordlength = list.get(i).length();
                firstlargestwordstring = list.get(i);
            }

            else if (list.get(i).length() > secondlargestwordlength) {
                secondlargestwordlength = list.get(i).length();
                secondlargestwordstring = list.get(i);
            }
        }

        System.out.println("First Smallest Word Length using ArrayList " + firstlargestwordlength);
        System.out.println("First Smallest Word using ArrayList " + firstlargestwordstring);

        System.out.println("Second Smallest Word Length using ArrayList " + secondlargestwordlength);
        System.out.println("Second Smallest Word using ArrayList " + secondlargestwordstring);
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
