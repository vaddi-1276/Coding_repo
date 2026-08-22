package Strings;

import java.util.ArrayList;

// Input:
// Java Selenium

// Output:
// jAVA sELENIUM

class UsingchForLoopToggleCase {
    public static void UsingchForLoopToggleCaseMethods(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result = result + (char) (ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                result = result + (char) (ch - 32);
            }

            else if (ch == ' ') {
                result = result + " ";
            }
        }
        System.out.println(result);
    }
}

class UsingBuiltinFunctionsToggleCase {
    public static void UsingBuiltinFunctionsToggleCaseMethods(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLowerCase(ch)) {
                result = result + Character.toUpperCase(ch);
            }

            else if (Character.isUpperCase(ch)) {
                result = result + Character.toLowerCase(ch);
            } else if (ch == ' ') {
                result = result + " ";
            }
        }
        System.out.println(result);
    }
}

class UsingArrayListToggleCase {
    public static void UsingArrayListToggleCaseMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            }

            else if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            }

            else if (ch == ' ') {
                result.append(' ');
            }

        }
        System.out.println(result);
    }
}

public class ToggleCase {
    public static void main(String[] args) {
        UsingchForLoopToggleCase.UsingchForLoopToggleCaseMethods("Java Selenium");
        UsingBuiltinFunctionsToggleCase.UsingBuiltinFunctionsToggleCaseMethods("Java Selenium");
        UsingArrayListToggleCase.UsingArrayListToggleCaseMethods("Java Selenium");
    }
}
