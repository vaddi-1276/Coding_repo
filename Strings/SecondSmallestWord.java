package Strings;

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

        System.out.println("First Smallest word Length " + words[0].length());
        System.out.println("First Smallest Word " + words[0]);

        System.out.println("Second Smallest word Length " + words[1].length());
        System.out.println("Second Smallest Word " + words[1]);
    }
}

class UsingTwoVariablesForSecondSmallestWord {
    public static void UsingTwoVariablesForSecondSmallestWordMethods(String str) {

        String words[] = str.split(" ");

        String firstsmallestword = words[0];
        String secondsmallestword = words[0];

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

        System.out.println("First Smallest word Length " + firstsmallestwordlength);
        System.out.println("First Smallest Word " + firstsmallestword);

        System.out.println("Second Smallest word Length " + secondsmallestwordlength);
        System.out.println("Second Smallest Word " + secondsmallestword);
    }
}

class UsingArrayListForSecondSmallestWord {
    public static void UsingArrayListForSecondSmallestWordMethods(String str) {

        String words[] = str.split(" ");

        String firstsmallestword = words[0];
        String secondsmallestword = words[0];

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

        System.out.println("First Smallest word Length " + firstsmallestwordlength);
        System.out.println("First Smallest Word " + firstsmallestword);

        System.out.println("Second Smallest word Length " + secondsmallestwordlength);
        System.out.println("Second Smallest Word " + secondsmallestword);
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
