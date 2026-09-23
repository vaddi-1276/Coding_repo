package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// abcdefg

// Output:
// gbedcfa

class AlternateCharacterReversalUsingLoop {
    public static void reverseUsingLoop(String str) {

        String onlyalternativeString = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                char ch = str.charAt(i);
                onlyalternativeString = onlyalternativeString + ch;
            }
        }
        String rev_onlyalternativeString = "";
        for (int i = onlyalternativeString.length() - 1; i >= 0; i--) {
            rev_onlyalternativeString = rev_onlyalternativeString + onlyalternativeString.charAt(i);
        }
        System.out.println(rev_onlyalternativeString);

        int index = 0;
        String finalresult = "";
        for (int i = 0; i < str.length(); i++) {

            if (i % 2 == 0) {
                finalresult = finalresult + rev_onlyalternativeString.charAt(index++);
            } else {
                finalresult = finalresult + str.charAt(i);
            }
        }
        System.out.println(finalresult);
    }
}

class AlternateCharacterReversalUsingArrayList {

    public static void reverseUsingArrayList(String str) {

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        ArrayList<Character> onlyEvenIndexValue = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                onlyEvenIndexValue.add(list.get(i));
            }
        }

        // ace

        ArrayList<Character> reverseOnlyEvenIndexValue = new ArrayList<>();

        for (int i = onlyEvenIndexValue.size() - 1; i >= 0; i--) {
            reverseOnlyEvenIndexValue.add(onlyEvenIndexValue.get(i));
        }

        // eca

        int index = 0;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {

            if (i % 2 == 0) {
                result.append(reverseOnlyEvenIndexValue.get(index++));
            } else {
                result.append(list.get(i));
            }
        }

        System.out.println(result);
    }
}

class AlternateCharacterReversalUsingCollections {
    public static void reverseUsingCollections(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        ArrayList<Character> onlyevenindexvalue = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                onlyevenindexvalue.add(list.get(i));
            }
        }
        Collections.reverse(onlyevenindexvalue);

        int index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                result.append(onlyevenindexvalue.get(index++));
            } else {
                result.append(list.get(i));
            }
        }
        System.out.println(result);
    }
}

class AlternateCharacterReverserRecursion {
    public static void AlternateCharacterReverserRecursionMethods(String str) {
        StringBuilder onlyevenindexcharacters = new StringBuilder();
        onlyevenindexvalueCharacters(str, 0, onlyevenindexcharacters);
        StringBuilder result = new StringBuilder(str);
        reverseonlyevenindexvalueCharacters(result, onlyevenindexcharacters, onlyevenindexcharacters.length() - 1, 0);
        System.out.println(result);
    }

    public static void onlyevenindexvalueCharacters(String str, int index, StringBuilder onlyevenvalues) {

        if (index >= str.length()) {
            return;
        }
        onlyevenvalues.append(str.charAt(index));
        onlyevenindexvalueCharacters(str, index + 2, onlyevenvalues);
    }

    public static void reverseonlyevenindexvalueCharacters(StringBuilder result, StringBuilder reverseonlyevenvalues,
            int evenindex, int stringindex) {
        if (stringindex >= result.length()) {
            return;
        }

        result.setCharAt(stringindex, reverseonlyevenvalues.charAt(evenindex));

        reverseonlyevenindexvalueCharacters(result, reverseonlyevenvalues, evenindex - 1, stringindex + 2);
    }
}

public class AlternateCharacterReverser {
    public static void main(String[] args) {
        AlternateCharacterReversalUsingLoop.reverseUsingLoop("abcdefg");
        // AlternateCharacterReversalUsingArrayList.reverseUsingArrayList("hijklmn");
        // AlternateCharacterReversalUsingCollections.reverseUsingCollections("nopqrst");
        // AlternateCharacterReverserRecursion.AlternateCharacterReverserRecursionMethods("abcdefg");
    }
}
