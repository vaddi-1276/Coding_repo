package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// Java Selenium Testing

// Output:
// Testing Selenium Java

class WordOrderUsingLoop {
    public static void reverseUsingLoop(String str) {

        String words[] = str.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        System.out.println();
    }
}

class UsingRecursionWordOrderReverser {

    public static void UsingRecursionWordOrderReverserMethods(
            String words[], int index, String result) {

        if (index == words.length) {
            System.out.println(result);
            return;
        }

        int reverseIndex = words.length - 1 - index;

        result = result + words[reverseIndex] + " ";

        UsingRecursionWordOrderReverserMethods(
                words, index + 1, result);
    }
}

class WordOrderUsingArrayList {
    public static void reverseUsingArrayList(String str) {
        ArrayList<String> list = new ArrayList<>();
        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }
        StringBuilder result = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            result.append(list.get(i));
            result.append(" ");
        }

        System.out.print(result);
        System.out.println();

    }
}

class WordOrderUsingCollections {
    public static void reverseUsingCollections(String str) {
        ArrayList<String> list = new ArrayList<>();
        String words[] = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }
        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i));
            result.append(" ");
        }
        System.out.println(result);
    }
}

public class WordOrderReverser {
    public static void main(String[] args) {
        WordOrderUsingLoop.reverseUsingLoop("Java Selenium Testing");

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        String str = "Java Selenium Testing";
        String words[] = str.split(" ");
        UsingRecursionWordOrderReverser.UsingRecursionWordOrderReverserMethods(words, 0, "");

        // WordOrderUsingArrayList.reverseUsingArrayList("Python Testing");
        // WordOrderUsingCollections.reverseUsingCollections("Java Learning");
    }
}
