package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// abcdef

// Output:
// ebcdaf

class AlternateCharacterReversalUsingLoop {
    public static void reverseUsingLoop(String str) {

        String onlyevenindexvalueString = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                onlyevenindexvalueString = onlyevenindexvalueString + str.charAt(i);
            }
        }

        String reverseonlyevenindexvalueString = "";

        for (int i = onlyevenindexvalueString.length() - 1; i >= 0; i--) {
            reverseonlyevenindexvalueString = reverseonlyevenindexvalueString + onlyevenindexvalueString.charAt(i);
        }

        int index = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result = result + reverseonlyevenindexvalueString.charAt(index++);
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}

class AlternateCharacterReversalUsingArrayList {
    public static void reverseUsingArrayList(String str) {
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

        ArrayList<Character> reverseonlyevenindexvalue = new ArrayList<>();
        for (int i = onlyevenindexvalue.size() - 1; i >= 0; i--) {
            reverseonlyevenindexvalue.add(onlyevenindexvalue.get(i));
        }
        System.out.println(reverseonlyevenindexvalue);

        int index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                result.append(reverseonlyevenindexvalue.get(index++));
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

public class AlternateCharacterReverser {
    public static void main(String[] args) {
        AlternateCharacterReversalUsingLoop.reverseUsingLoop("abcdef");
        AlternateCharacterReversalUsingArrayList.reverseUsingArrayList("abcdef");
        AlternateCharacterReversalUsingCollections.reverseUsingCollections("abcdef");
    }
}
