package Algorthims;

public class MinimumCoins {
    public static int MinimumCoinsMethods(int arr[]) {

        int amount = 11;
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (amount >= arr[i]) {
                amount = amount - arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(MinimumCoinsMethods(new int[] { 1, 2, 5 }));
    }
}
