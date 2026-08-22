package Strings;

import java.util.ArrayList;

// Input:
// aaabbccdaa

// Output:
// abcda

class UsingForLoopRemoveConsecutiveDuplicates {
    public static void UsingForLoopRemoveConsecutiveDuplicatesMethods(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}

class UsingArrayListRemoveConsecutiveDuplicates {
    public static void UsingArrayListRemoveConsecutiveDuplicatesMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {

            if(i==0 || list.get(i)!=list.get(i-1))
            {
                result.append(list.get(i));
            }
        }
        System.out.println(result);
    }
}

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        UsingForLoopRemoveConsecutiveDuplicates.UsingForLoopRemoveConsecutiveDuplicatesMethods("aaabbccdaa");
        UsingArrayListRemoveConsecutiveDuplicates.UsingArrayListRemoveConsecutiveDuplicatesMethods("aaabbccdaa");
    }
}
