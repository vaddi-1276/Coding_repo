package Arrays_and_Strings;

// Input:

// 10, 11, 12, 13, 14, 17, 20

public class FindPrimeNumbers_MaximumandMinimumPrime_andCount {
    public static void main(String[] args) {

        int arr[] = { 10, 11, 12, 13, 14, 17, 20 };

        int maxprimenumber = Integer.MIN_VALUE;
        int minprimenumber = Integer.MAX_VALUE;
        int totalcount = 0;

        System.out.print("Prime Numbers : ");
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 1; j <= arr[i]; j++) {

                if (arr[i] % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(arr[i] + " ");
                totalcount++;

                if (arr[i] > maxprimenumber) {
                    maxprimenumber = arr[i];
                }
                if (arr[i] < minprimenumber) {
                    minprimenumber = arr[i];
                }
            }
        }
        System.out.println();
        System.out.println(maxprimenumber);
        System.out.println(minprimenumber);
        System.out.println(totalcount);
    }
}
