package Strings;

import java.util.ArrayList;

// Input:
// Java Selenium Testing

// Output:
// JavaSeleniumTesting

class WhitespaceRemovalUsingLoop {
    public static void removeUsingLoop(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            } else {
                result = result + ch;
            }
        }

        System.out.println(result);
    }
}

class WhitespaceRemovalUsingStringBuilder {
    public static void removeUsingStringBuilder(String str) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            } else {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}

class WhitespaceRemovalUsingArrayList {
    public static void removeUsingArrayList(String str) {
        ArrayList<Character> list = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (ch == ' ') {
                continue;
            } else {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}

public class WhitespaceRemover {
    public static void main(String[] args) {
        WhitespaceRemovalUsingLoop.removeUsingLoop("Java Selenium Testing");
        WhitespaceRemovalUsingStringBuilder.removeUsingStringBuilder("Appium Ruby Learn");
        WhitespaceRemovalUsingArrayList.removeUsingArrayList("Seleinum Testing Learn");
    }
}
