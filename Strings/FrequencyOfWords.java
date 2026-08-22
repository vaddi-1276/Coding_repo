package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// Java Selenium Java Testing Selenium Java

// Output:
// Java = 3
// Selenium = 2
// Testing = 1

class UsingNestedForLoopFrequencyOfWords {

    public static void UsingNestedForLoopFrequencyOfWordsMethods(String str) {

        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {

                if (words[i].equals(words[j])) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }
            int count = 1;
            for (int k = i + 1; k < words.length; k++) {
                if (words[k].equals(words[i])) {
                    count++;
                }
            }
            System.out.println(words[i] + " = " + count);
        }

    }
}

class UsingArrayListFrequencyofWords {
    public static void UsingArrayListFrequencyofWordsMethods(String str) {
        ArrayList<String> list = new ArrayList<>();

        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (list.get(i).equals(list.get(j))) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }
            int count = 1;
            for (int k = i + 1; k < list.size(); k++) {
                if (list.get(k).equals(list.get(i))) {
                    count++;
                }
            }

            System.out.println(list.get(i) + " = " + count);
        }
    }
}

class UsingCollectionsFrequency {
    public static void UsingCollectionsFrequencyMethods(String str) {

        ArrayList<String> list = new ArrayList<>();
        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (list.get(i).equals(list.get(j))) {
                    found = true;
                    break;
                }
            }

            if (found) {
                continue;
            }

            int count = Collections.frequency(list, list.get(i));

            System.out.println(list.get(i) + " = " + count);
        }
    }
}

public class FrequencyOfWords {
    public static void main(String[] args) {
        UsingNestedForLoopFrequencyOfWords
                .UsingNestedForLoopFrequencyOfWordsMethods("Java Selenium Java Testing Selenium Java");
        UsingArrayListFrequencyofWords
                .UsingArrayListFrequencyofWordsMethods("Java Selenium Java Testing Selenium Java");
        UsingCollectionsFrequency.UsingCollectionsFrequencyMethods("Java Selenium Java Testing Selenium Java");
    }
}
