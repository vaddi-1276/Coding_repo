package Strings;

import java.util.ArrayList;

// Input:
// Java Selenium Testing

// Output:
// Java-Selenium-Testing

class SpaceToHyphenUsingReplace {
    public static void convertUsingReplace(String str) {

        String result = str.replace(" ", "-");
        System.out.println(result);
    }
}

class SpaceToHyphenUsingLoop {
    public static void convertUsingLoop(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                result = result + "-";
            } else {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}

class UsingArrayListSpaceToHyphenConverter {
    public static void UsingArrayListSpaceToHyphenConverterMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (ch == ' ') {
                result.append("-");
            } else {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}

public class SpaceToHyphenConverter {
    public static void main(String[] args) {
        SpaceToHyphenUsingReplace.convertUsingReplace("Java Selenium Testing");
        SpaceToHyphenUsingLoop.convertUsingLoop("Python Selenium Testing");
        UsingArrayListSpaceToHyphenConverter.UsingArrayListSpaceToHyphenConverterMethods("Java Selenium Python");
    }
}
