package Strings;

import java.util.ArrayList;

// Input:
// Java Selenium Automation

// Output:
// Java

class SmallestWordUsingSorting {
    public static void findUsingSortingMethods(String str) {

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
        System.out.println(words[0]);
        System.out.println(words[0].length());
    }
}

class SmallestWordUsingLoop {
    public static void findUsingLoopMethods(String str) {

        String words[] = str.split(" ");
        String smallestWord = words[0];
        int smallestLength = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < smallestLength) {
                smallestLength = words[i].length();
                smallestWord = words[i];
            }
        }
        System.out.println(smallestWord);
        System.out.println(smallestLength);

    }

}

class SmallestWordUsingArrayList {
    public static void SmallestWordUsingArrayListMethods(String str) {

        ArrayList<String> list = new ArrayList<>();
        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }

        String smallestword = words[0];
        int smallestwordlength = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < smallestwordlength) {
                smallestwordlength = list.get(i).length();
                smallestword = list.get(i);
            }
        }
        System.out.println(smallestword);
        System.out.println(smallestwordlength);
    }
}

public class FindSmallestWord {
    public static void main(String[] args) {
        SmallestWordUsingSorting.findUsingSortingMethods("Java Selenium Automation");
        SmallestWordUsingLoop.findUsingLoopMethods("Java Selenium Automation");
        SmallestWordUsingArrayList.SmallestWordUsingArrayListMethods("Java Selenium Automation");
    }
}
