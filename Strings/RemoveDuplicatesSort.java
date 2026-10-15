package Strings;

import java.util.ArrayList;
import java.util.Arrays;

// Input:
// programming

// Output:
// Unique = progamin
// Sorted = aggimnop

class UsingForLoopRemoveDuplicatesSort {
    public static void UsingForLoopRemoveDuplicatesSortMethods(String str) {
        String UniqueString = "";
        for (int i = 0; i < str.length(); i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }
            UniqueString = UniqueString + str.charAt(i);
        }
        System.out.println("Unique = " + UniqueString);

        String SortedString = "";
        char arr[] = UniqueString.toCharArray();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            SortedString = SortedString + arr[i];
        }
        System.out.println("Sorted = " + SortedString);
    }
}

class UsingArrayListRemoveDuplicatesSort {

    public static void UsingArrayListRemoveDuplicatesSortMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        String uniqueString = "";
        for (int i = 0; i < list.size(); i++) {
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (list.get(i) == list.get(j)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                continue;
            }

            uniqueString = uniqueString + list.get(i);
        }
        System.out.println("Unique = " + uniqueString);

        char sortedstring[] = uniqueString.toCharArray();

        Arrays.sort(sortedstring);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sortedstring.length; i++) {
            result.append(sortedstring[i]);
        }
        System.out.println("Sorted = " + result);
    }
}

public class RemoveDuplicatesSort {
    public static void main(String[] args) {
        UsingForLoopRemoveDuplicatesSort.UsingForLoopRemoveDuplicatesSortMethods("programming");
        // UsingArrayListRemoveDuplicatesSort.UsingArrayListRemoveDuplicatesSortMethods("programming");
    }
}
