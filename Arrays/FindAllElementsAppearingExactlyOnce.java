package Arrays;

import java.util.ArrayList;
import java.util.Collections;

// Input: [10, 20, 10, 30, 20, 40, 50]
// Output: 30, 40, 50

class UsingNestedForLoopFindAllElementsAppearingExactlyOnce {
    public static void UsingNestedForLoopFindAllElementsAppearingExactlyOnceMethods(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }

            int count = 1;
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] == arr[i]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(arr[i]);
            }
        }
    }
}

class UsingCollectionsFrequencyFindAllElementsAppearingExactlyOnce {
    public static void UsingCollectionsFrequencyFindAllElementsAppearingExactlyOnceMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            int count = Collections.frequency(list, list.get(i));

            if (count == 1) {
                System.out.println(list.get(i));
            }
        }
    }
}


public class FindAllElementsAppearingExactlyOnce {
    public static void main(String[] args) {
        UsingNestedForLoopFindAllElementsAppearingExactlyOnce
                .UsingNestedForLoopFindAllElementsAppearingExactlyOnceMethods(new int[] { 10, 20, 10, 30, 20, 40, 50 });
        System.out.println("------------------------------------------------------------------------");
        UsingCollectionsFrequencyFindAllElementsAppearingExactlyOnce
                .UsingCollectionsFrequencyFindAllElementsAppearingExactlyOnceMethods(
                        new int[] { 10, 20, 10, 30, 20, 40, 50 });
    }
}
