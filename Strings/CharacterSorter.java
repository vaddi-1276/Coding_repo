package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Input:
// programming

// Output:
// aggimmnoprr

class CharacterSortingUsingArrayList {
    public static void sortUsingArrayList(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        Collections.sort(list);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i));
        }
        System.out.println(result);
    }
}

class CharacterSortingUsingArray {
    public static void sortUsingArray(String str) {
        char ch[] = str.toCharArray();

        Arrays.sort(ch);
        System.out.println(ch);

    }
}

public class CharacterSorter {
    public static void main(String[] args) {
        CharacterSortingUsingArrayList.sortUsingArrayList("programming");
        CharacterSortingUsingArray.sortUsingArray("programming");
    }
}
