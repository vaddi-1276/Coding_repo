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
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result = result + list.get(i);
        }
        System.out.println(result);
    }
}

class CharacterSortingUsingArray {
    public static void sortUsingArray(String str) {

        char ch[] = str.toCharArray();

        Arrays.sort(ch);
        String result = "";
        for (int i = 0; i < ch.length; i++) {
            result = result + ch[i];
        }
        System.out.println(result);
    }
}

class WithoutUsingSortingCharacterSorter {
    public static void WithoutUsingSortingCharacterSorterMethods(String str) {

        char arr[] = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }
        System.out.println(result);
    }
}

class UsingRecursionCharacterSorter {
    public static void UsingRecursionCharacterSorterMethods(char arr[], int index) {
        if (index == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = index + 1; i < arr.length; i++) {
            if (arr[index] > arr[i]) {
                char temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        UsingRecursionCharacterSorterMethods(arr, index + 1);
    }
}

public class CharacterSorter {
    public static void main(String[] args) {
        // CharacterSortingUsingArrayList.sortUsingArrayList("programming");

        // System.out.print(
        // "--------------------------------------------------------------------------------------------------------------");

        CharacterSortingUsingArray.sortUsingArray("programming");

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        WithoutUsingSortingCharacterSorter.WithoutUsingSortingCharacterSorterMethods("programming");

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        String str="programming";
        char arr[]=str.toCharArray();
        UsingRecursionCharacterSorter.UsingRecursionCharacterSorterMethods(arr, 0);

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();
    }
}
