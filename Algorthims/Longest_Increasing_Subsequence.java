package Algorthims;

// [10,9,2,5,3,7,101,18]

// 4

public class Longest_Increasing_Subsequence {

    public static int Longest_Increasing_SubsequenceMethods(int arr[]) {

        int count[] = new int[arr.length];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            count[i] = 1;

            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    count[i] = Math.max(count[i], count[j] + 1);
                }
            }

            if(count[i]>max)
            {
                max=count[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(Longest_Increasing_SubsequenceMethods(new int[]{10,9,2,5,3,7,101,18}));
    }
}
