package Strings;

import java.util.ArrayList;

// Input:
// abcdef
// N = 2

// Output:
// efabcd

class UsingSubStringRightbyN {
    public static void UsingSubStringRightbyNMethods(String str, int position) {
        String result = "";
        result = result + str.substring(str.length() - position, str.length());
        result = result + str.substring(0, str.length() - position);

        System.out.println(result);
    }
}

class UsingNestedForLoopRotateStringRightbyN {
    public static void UsingNestedForLoopRotateStringRightbyNMethods(String str, int position) {

        String result = "";

        for (int i = str.length() - position; i < str.length(); i++) {
            result = result + str.charAt(i);
        }

        for (int i = 0; i < str.length() - position; i++) {
            result = result + str.charAt(i);
        }

        System.out.println(result);
    }
}

class UsingArrayListRotateStringRightbyN {
    public static void UsingArrayListRotateStringRightbyNMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        int position = 2;
        StringBuilder result = new StringBuilder();

        for (int i = list.size() - position; i < list.size(); i++) {
            result.append(list.get(i));
        }

        for (int i = 0; i < list.size() - position; i++) {
            result.append(list.get(i));
        }

        System.out.println(result);
    }
}

public class RotateStringRightbyN {
    public static void main(String[] args) {
        UsingSubStringRightbyN.UsingSubStringRightbyNMethods("abcdef", 2);
        UsingNestedForLoopRotateStringRightbyN.UsingNestedForLoopRotateStringRightbyNMethods("abcdef", 2);
        // UsingArrayListRotateStringRightbyN.UsingArrayListRotateStringRightbyNMethods("abcdef");
    }
}
