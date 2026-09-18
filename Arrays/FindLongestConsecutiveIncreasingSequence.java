package Arrays;

// Input: [1, 2, 3, 7, 8, 9, 10, 2]
// Output: [7, 8, 9, 10]

class UsingNestedForLoopFindLongestConsecutiveIncreasingSequence {
    public static void UsingNestedForLoopFindLongestConsecutiveIncreasingSequenceMethods(int arr[]) {

        int count = 1;
        int maxcount = 1;

        int start = 1;
        int maxstart = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 == arr[i + 1]) {
                count++;

                if (count > maxcount) {
                    maxcount = count;
                    maxstart = start;
                }
            } else {
                count = 1;
                start = i + 1;
            }
        }

        for (int k = maxstart; k < maxstart + maxcount; k++) {
            System.out.println(arr[k]);
        }
    }
}


public class FindLongestConsecutiveIncreasingSequence {
    public static void main(String[] args) {
        UsingNestedForLoopFindLongestConsecutiveIncreasingSequence
                .UsingNestedForLoopFindLongestConsecutiveIncreasingSequenceMethods(
                        new int[] { 1, 2, 3, 7, 8, 9, 10, 2 });
    }
}
