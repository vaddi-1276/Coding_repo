package Arrays;

// Input: [1, 2, 3, 7, 8, 9, 10]
// Output: 4

class UsingNestedForLoopFindLengthofConsecutiveIncreasingSequence {
    public static void UsingNestedForLoopFindLengthofConsecutiveIncreasingSequenceMethods(int arr[]) {

        int count = 1;
        int maxcount = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 == arr[i + 1]) {
                count++;
            }

            else {
                count = 1;
            }

            if (count > maxcount) {
                maxcount = count;
            }
        }

        System.out.println(count);
    }
}

class UsingRecursionFindLengthofConsecutiveIncreasingSequence {
    public static void UsingRecursionFindLengthofConsecutiveIncreasingSequenceMethods(int arr[], int index,
            int count) {

        if (index == arr.length - 1) {
            System.out.println(count);
            return;
        }

        if (arr[index] + 1 == arr[index + 1]) {
            count++;
        } else {
            count = 1;
        }

        UsingRecursionFindLengthofConsecutiveIncreasingSequenceMethods(arr, index + 1, count);
    }
}

public class FindLengthofConsecutiveIncreasingSequence {
    public static void main(String[] args) {
        UsingNestedForLoopFindLengthofConsecutiveIncreasingSequence
                .UsingNestedForLoopFindLengthofConsecutiveIncreasingSequenceMethods(new int[] { 1, 2, 3, 7, 8, 9, 10 });
        UsingRecursionFindLengthofConsecutiveIncreasingSequence
                .UsingRecursionFindLengthofConsecutiveIncreasingSequenceMethods(new int[] { 1, 2, 3, 7, 8, 9, 10 }, 0,
                        1);
    }
}
