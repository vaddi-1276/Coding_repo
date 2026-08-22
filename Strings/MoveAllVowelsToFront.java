package Strings;

import java.util.ArrayList;

// Input:
// automation

// Output:
// auoaiotmtn

class UsingForLoopMoveAllVowelsToFront {
    public static void UsingForLoopMoveAllVowelsToFrontMethods(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                result = result + ch;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e' && ch != 'i'
                    && ch != 'o' && ch != 'u') {
                result = result + ch;
            }

        }
        System.out.println(result);

    }
}

class UsingArrayListMoveAllVowelsToFront {
    public static void UsingArrayListMoveAllVowelsToFrontMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                result.append(ch);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e' && ch != 'i'
                    && ch != 'o' && ch != 'u') {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}

public class MoveAllVowelsToFront {
    public static void main(String[] args) {
        UsingForLoopMoveAllVowelsToFront.UsingForLoopMoveAllVowelsToFrontMethods("automation");
        UsingArrayListMoveAllVowelsToFront.UsingArrayListMoveAllVowelsToFrontMethods("automation");
    }
}
