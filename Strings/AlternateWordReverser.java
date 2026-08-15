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
                result = result + " ";
            } else {
                result = result + words[i];
            }
            result = result + " ";
        }
        System.out.println(result);
    }
}

class AlternateWordReversalUsingStringBuilder {
    public static void reverseUsingStringBuilder(String str) {
        String words[] = str.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                result = result + new StringBuilder(words[i]).reverse().toString() + " ";
            } else {
                result = result + words[i] + " ";
            }
        }
        System.out.println(result);
    }
}

class AlternateWordReversalUsingArrayList {

    public static void reverseUsingArrayList(String str) {
        ArrayList<String> list = new ArrayList<>();
        String words[] = str.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                for (int j = list.get(i).length() - 1; j >= 0; j--) {
                    result = result + list.get(i).charAt(j);
                }
                result = result + " ";
            } else {
                result = result + list.get(i) + " ";
            }
        }
        System.out.println(result);
    }
}

public class AlternateWordReverser {
    public static void main(String[] args) {
        AlternateWordReversalUsingLoop.reverseUsingLoop("Java Selenium Testing Automation");
        AlternateWordReversalUsingStringBuilder.reverseUsingStringBuilder("Python Selenium Testing Automation");
        AlternateWordReversalUsingArrayList.reverseUsingArrayList("Javascript Selenium Testing Automation");
    }
}
