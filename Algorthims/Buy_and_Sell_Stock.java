package Algorthims;

public class Buy_and_Sell_Stock {
    public static int Buy_and_Sell_StockMethods(int arr[]) {
        int maxprofit = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int profit = arr[j] - arr[i];

                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        System.out.println(Buy_and_Sell_StockMethods(new int[] { 7, 1, 5, 3, 6, 4 }));
    }
}
