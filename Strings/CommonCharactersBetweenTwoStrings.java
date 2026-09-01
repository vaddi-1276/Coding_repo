package Strings;

import java.util.ArrayList;

// Input:
// programming
// automation

// Output:
// o
// a
// m
// i
// n

class UsingForLoopCommonCharactersBetweenTwoStrings {
    public static void UsingForLoopCommonCharactersBetweenTwoStringsMethods(String str1, String str2) {
        
        for(int i=0;i<str1.length();i++)
        {
            boolean found=false;
            for(int j=0;j<str2.length();j++)
            {
                if(str1.charAt(i)==str2.charAt(j))
                {
                    found=true;
                    break;
                }
            }

            boolean found1=false;
        }
    }
}

class UsingArrayListCommonCharactersBetweenTwoStrings {
    public static void UsingArrayListCommonCharactersBetweenTwoStringsMethods(String str1, String str2) {

        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        for (int i = 0; i < str1.length(); i++) {
            list1.add(str1.charAt(i));
        }

        for (int i = 0; i < str2.length(); i++) {
            list2.add(str2.charAt(i));
        }

        for (int i = 0; i < list1.size(); i++) {
            boolean found = false;
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    found = true;
                    break;
                }
            }

            boolean found1 = false;
            for (int k = 0; k < i; k++) {

                if (list1.get(k) == list1.get(i)) {
                    found1 = true;
                    break;
                }
            }

            if (found && !found1) {
                System.out.println(list1.get(i));
            }
        }
    }
}

public class CommonCharactersBetweenTwoStrings {
    public static void main(String[] args) {
        UsingForLoopCommonCharactersBetweenTwoStrings
                .UsingForLoopCommonCharactersBetweenTwoStringsMethods("programming", "automation");
        UsingArrayListCommonCharactersBetweenTwoStrings.UsingArrayListCommonCharactersBetweenTwoStringsMethods(
                "programming",
                "automation");
    }
}
