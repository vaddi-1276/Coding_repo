package Strings;

import java.util.ArrayList;

// Input:
// automation

// Output:
// * *t*m*t**n

class VowelMaskingUsingLoop {
    public static void maskUsingLoop(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                result = result + "*";
            } else {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}

class VowelMaskingUsingArrayList {
    public static void maskUsingArrayList(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u')

            {
                result.append("*");

            } else {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}

public class VowelMasker_with_Star_Symbol {
    public static void main(String[] args) {
        VowelMaskingUsingLoop.maskUsingLoop("automation");
        VowelMaskingUsingArrayList.maskUsingArrayList("automation");
    }
}
