package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Input:
// programming

// Output:
// Sorted = aggimmnoprr
// a = 1
// g = 2
// i = 1
// m = 2
// n = 1
// o = 1
// p = 1
// r = 2

class UsingForLoopSortAndFrequencyCount {
    public static void UsingForLoopSortAndFrequencyCountMethods(String str) {

        String SortedString = "";
        char arr[] = str.toCharArray();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            SortedString = SortedString + arr[i];
        }
        System.out.println("Sorted = " + SortedString);

        for (int i = 0; i < SortedString.length(); i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (SortedString.charAt(i) == SortedString.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                continue;
            }
            int count = 1;
            for (int k = i + 1; k < SortedString.length(); k++) {
                if (SortedString.charAt(k) == SortedString.charAt(i)) {
                    count++;
                }
            }

            System.out.println(SortedString.charAt(i) + " = " + count);
        }
    }
}

class UsingArrayListSortAndFrequencyCount {
    public static void UsingArrayListSortAndFrequencyCountMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        Collections.sort(list);

        StringBuilder sortedstringvalue = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sortedstringvalue.append(list.get(i));
        }
        System.out.println("Sorted = " + sortedstringvalue);

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
            int count = 1;
            for (int k = i + 1; k < list.size(); k++) {
                if (list.get(k) == list.get(i)) {
                    count++;
                }
            }
            System.out.println(list.get(i) + " = " + count);
        }
    }
}

public class SortAndFrequencyCount {
    public static void main(String[] args) {
        UsingForLoopSortAndFrequencyCount.UsingForLoopSortAndFrequencyCountMethods("programming");
        UsingArrayListSortAndFrequencyCount.UsingArrayListSortAndFrequencyCountMethods("programming");
    }
}
