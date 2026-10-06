package Strings;

import java.util.ArrayList;
// Input:
// Java Selenium Testing Automation

// Output:
// avaJ Selenium gnitseT Automation

class AlternateWordReversalUsingLoop {

    public static void reverseUsingLoop(String str) {

        String words[] = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                for (int j = words[i].length() - 1; j >= 0; j--) {
                    result = result + words[i].charAt(j);
                }
            } else {
                result = result + words[i];
            }

            result = result + " ";
        }

        System.out.println(result);
    }
}

class UsingRecursionAlternateWordReverser {
    public static void UsingRecursionAlternateWordReverserMethods(String str, int index, String result) {

        String words[] = str.split(" ");
        if (index == words.length) {
            System.out.println(result);
            return;
        }
        if (index % 2 == 0) {
            for (int j = words[index].length() - 1; j >= 0; j--) {
                result = result + words[index].charAt(j);
            }
        } else {
            result = result + words[index];
        }
        result = result + " ";
        UsingRecursionAlternateWordReverserMethods(str, index + 1, result);
    }
}

class AlternateWordReversalUsingStringBuilder {
    public static void reverseUsingStringBuilder(String str) {
        StringBuilder result = new StringBuilder();
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                for (int j = words[i].length() - 1; j >= 0; j--) {
                    result.append(words[i].charAt(j));
                }
            } else {
                result.append(words[i]);
            }
            result.append(" ");
        }
        System.out.println(result);
    }
}

class AlternateWordReversalUsingArrayList {
    public static void reverseUsingArrayList(String str) {

        ArrayList<String> list = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                for (int j = list.get(i).length() - 1; j >= 0; j--) {
                    result.append(words[i].charAt(j));
                }
            } else {
                result.append(words[i]);
            }
            result.append(" ");
        }
        System.out.println(result);
    }
}

public class AlternateWordReverser {
    public static void main(String[] args) {
        AlternateWordReversalUsingLoop.reverseUsingLoop("Java Selenium Testing Automation");

        System.out.println(
                "-------------------------------------------------------------------------------------------------");

        UsingRecursionAlternateWordReverser
                .UsingRecursionAlternateWordReverserMethods("Java Selenium Testing Automation", 0, "");

        System.out.println(
                "-------------------------------------------------------------------------------------------------");
        // AlternateWordReversalUsingStringBuilder.reverseUsingStringBuilder("Python
        // Selenium Testing Automation");
        // AlternateWordReversalUsingArrayList.reverseUsingArrayList("Javascript
        // Selenium Testing Automation");
    }
}
