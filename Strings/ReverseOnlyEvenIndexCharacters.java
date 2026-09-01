package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// abcdef

// Output:
// ebcdaf

class UsingNestedForLoopReverseOnlyEvenIndexCharacters {
    public static void UsingNestedForLoopReverseOnlyEvenIndexCharactersMethods(String str) {

        String onlyevenindexvalue = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                onlyevenindexvalue = onlyevenindexvalue + str.charAt(i);
            }
        }

        String reverseonlyevenindexvalue = "";

        for (int i = onlyevenindexvalue.length() - 1; i >= 0; i--) {
            reverseonlyevenindexvalue = reverseonlyevenindexvalue + onlyevenindexvalue.charAt(i);
        }

        int index = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result = result + reverseonlyevenindexvalue.charAt(index++);
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}

class UsingArrayListCollectionsReverseOnlyEvenIndexCharacters {
    public static void UsingArrayListCollectionsReverseOnlyEvenIndexCharactersMethods(String str) {

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

public class ReverseOnlyEvenIndexCharacters {
    public static void main(String[] args) {
        UsingNestedForLoopReverseOnlyEvenIndexCharacters
                .UsingNestedForLoopReverseOnlyEvenIndexCharactersMethods("abcdef");
        UsingArrayListCollectionsReverseOnlyEvenIndexCharacters
                .UsingArrayListCollectionsReverseOnlyEvenIndexCharactersMethods("abcdef");
    }
}
