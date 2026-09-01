package Strings;

import java.util.ArrayList;

// Input:
// abcdef
// N = 2

// Output:
// cdefab

class UsingNestedForLoopRotateStringLeftbyN {
    public static void UsingNestedForLoopRotateStringLeftbyNMethods(String str) {

        int positions = 2;
        String result = "";

        for (int i = positions; i < str.length(); i++) {
            result = result + str.charAt(i);
        }

        for (int i = 0; i < positions; i++) {
            result = result + str.charAt(i);
        }
        System.out.println(result);
    }
}

class UsingSubstringRotateStringLeftbyN {
    public static void UsingSubstringRotateStringLeftbyNMethods(String str) {

        int positions = 2;

        String result = "";

        result = result + str.substring(positions);
        result = result + str.substring(0, positions);

        System.out.println(result);
    }
}

class UsingArrayListRotateStringLeftbyN {
    public static void UsingArrayListRotateStringLeftbyNMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        int positions = 2;
        StringBuilder result = new StringBuilder();
        for (int i = positions; i < list.size(); i++) {
            result.append(list.get(i));
        }

        for (int i = 0; i < positions; i++) {
            result.append(list.get(i));
        }
        System.out.println(result);
    }
}

public class RotateStringLeftbyN {
    public static void main(String[] args) {
        UsingNestedForLoopRotateStringLeftbyN.UsingNestedForLoopRotateStringLeftbyNMethods("abcdef");
        UsingSubstringRotateStringLeftbyN.UsingSubstringRotateStringLeftbyNMethods("abcdef");
        UsingArrayListRotateStringLeftbyN.UsingArrayListRotateStringLeftbyNMethods("abcdef");
    }
}
