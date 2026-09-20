package Arrays;

// Input: [10, 9, 8, 5, 4, 3, 2]
// Output: [5, 4, 3, 2]

class UsingNestedForLoopFindLongestConsecutiveDecreasingSequence {
    public static void UsingNestedForLoopFindLongestConsecutiveDecreasingSequenceMethods(int arr[]) {

        int count = 1;
        int mincount = 1;

        int start = 1;
        int maxstart = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] - 1 == arr[i + 1]) {
                count++;

                if (count > mincount) {
                    mincount = count;
                    maxstart = start;
                }
            } else {
                count = 1;
                start = i + 1;
            }
        }

        System.out.print("[");
        for (int k = maxstart; k < maxstart + mincount; k++) {
            System.out.print(arr[k]);

            if (k < maxstart + mincount - 1) {
                System.out.print(",");
            }
        }

        System.out.print("]");

        System.out.println();
    }
}

public class FindLongestConsecutiveDecreasingSequence {
    public static void main(String[] args) {
        UsingNestedForLoopFindLongestConsecutiveDecreasingSequence
                .UsingNestedForLoopFindLongestConsecutiveDecreasingSequenceMethods(new int[] { 10, 9, 8, 5, 4, 3, 2 });
    }
}
