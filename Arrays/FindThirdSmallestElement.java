package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Input: [10, 40, 20, 50, 30]
// Output: 30

class UsingArraysSortFindThirdSmallestElement {
    public static void UsingArraysSortFindThirdSmallestElementMethods(int arr[]) {
        Arrays.sort(arr);
        System.out.println(arr[2]);
    }
}

class UsingArrayListCollectionsSortFindThirdSmallestElement {
    public static void UsingArrayListCollectionsSortFindThirdSmallestElementMethods(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list);

        System.out.println(list.get(2));
    }
}

class UsingVariablesFindThirdSmallestElement {
    public static void UsingVariablesFindThirdSmallestElementMethods(int arr[]) {

        int firstsmallestnumber = Integer.MAX_VALUE;
        int secondsmallestnumber = Integer.MAX_VALUE;
        int thirdsmallestnumber = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < firstsmallestnumber) {
                thirdsmallestnumber = secondsmallestnumber;
                secondsmallestnumber = firstsmallestnumber;
                firstsmallestnumber = arr[i];
            }

            else if (arr[i] < secondsmallestnumber && firstsmallestnumber != arr[i]) {
                thirdsmallestnumber = secondsmallestnumber;
                secondsmallestnumber = arr[i];
            }

            else if (arr[i] < thirdsmallestnumber) {
                thirdsmallestnumber = arr[i];
            }
        }

        System.out.println(thirdsmallestnumber);
    }
}

class UsingRecursionFindThirdSmallestElement {
    public static void UsingRecursionFindThirdSmallestElementMethods(int arr[], int index, int firstsmallestnumber,
            int secondsmallestnumber, int thirdsmallestnumber) {

        if (index == arr.length) {
            System.out.println(thirdsmallestnumber);
            return;
        }

        if (arr[index] < firstsmallestnumber) {
            thirdsmallestnumber = secondsmallestnumber;
            secondsmallestnumber = firstsmallestnumber;
            firstsmallestnumber = arr[index];
        }

        else if (arr[index] < secondsmallestnumber && firstsmallestnumber != arr[index]) {
            thirdsmallestnumber = secondsmallestnumber;
            secondsmallestnumber = arr[index];
        } else if (arr[index] < thirdsmallestnumber && secondsmallestnumber != arr[index]) {
            thirdsmallestnumber = arr[index];
        }

        UsingRecursionFindThirdSmallestElementMethods(arr, index + 1, firstsmallestnumber, secondsmallestnumber,
                thirdsmallestnumber);
    }
}

public class FindThirdSmallestElement {
    public static void main(String[] args) {
        UsingArraysSortFindThirdSmallestElement
                .UsingArraysSortFindThirdSmallestElementMethods(new int[] { 10, 40, 20, 50, 60 });
        UsingArrayListCollectionsSortFindThirdSmallestElement
                .UsingArrayListCollectionsSortFindThirdSmallestElementMethods(new int[] { 10, 40, 20, 50, 60 });
        UsingVariablesFindThirdSmallestElement
                .UsingVariablesFindThirdSmallestElementMethods(new int[] { 10, 40, 20, 50, 60 });
        UsingRecursionFindThirdSmallestElement
                .UsingRecursionFindThirdSmallestElementMethods(new int[] { 10, 40, 20, 50, 60 }, 0, Integer.MAX_VALUE,
                        Integer.MAX_VALUE, Integer.MAX_VALUE);
    }
}
