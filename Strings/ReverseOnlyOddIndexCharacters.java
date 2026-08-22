package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// abcdef

// Output:
// afcdeb

class UsingNestedForLoopReverseOnlyOddIndexCharacters

{
    public static void UsingNestedForLoopReverseOnlyOddIndexCharactersMethods(String str) {

        String oddvalueString = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                oddvalueString = oddvalueString + str.charAt(i);
            }
        }
        String reverseoddvalueString = "";

        for (int i = oddvalueString.length() - 1; i >= 0; i--) {
            reverseoddvalueString = reverseoddvalueString + oddvalueString.charAt(i);
        }
        int index = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                result = result + reverseoddvalueString.charAt(index++);
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}

class UsingArrayListCollectionsReverseReverseOnlyOddIndexCharacters {
    public static void UsingArrayListCollectionsReverseReverseOnlyOddIndexCharactersMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        ArrayList<Character> oddindexvalue = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                oddindexvalue.add(list.get(i));
            }
        }
        Collections.reverse(oddindexvalue);
        int index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                result.append(oddindexvalue.get(index++));
            } else {
                result.append(list.get(i));
            }
        }

        System.out.println(result);
    }
}

public class ReverseOnlyOddIndexCharacters {
    public static void main(String[] args) {
        UsingNestedForLoopReverseOnlyOddIndexCharacters
        .UsingNestedForLoopReverseOnlyOddIndexCharactersMethods("abcdef");
        UsingArrayListCollectionsReverseReverseOnlyOddIndexCharacters
                .UsingArrayListCollectionsReverseReverseOnlyOddIndexCharactersMethods("abcdef");
    }
}
