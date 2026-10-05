package Algorthims;

// [7,1,5,3,6,4]

// 5

// profit =arr[1]-arr[0];

// maxprofit =profit

//Iterations:


// arr[j] 1-7 = -6
// arr[j] 5-7 = -2
// arr[j] 3-7 = -4
// arr[j] 6-7 = -1
// arr[j] 4-7 = -3
// -------------------------------------------------------------
// arr[j] 5-1 = 4
// arr[j] 3-1 = 2
// arr[j] 6-1 = 5
// arr[j] 4-1 = 3
// -------------------------------------------------------------
// arr[j] 3-5 = -2
// arr[j] 6-5 = 1
// arr[j] 4-5 = -1
// -------------------------------------------------------------
// arr[j] 6-3 = 3
// arr[j] 4-3 = 1
// -------------------------------------------------------------
// arr[j] 4-6 = -2
// -------------------------------------------------------------
// -------------------------------------------------------------
// 5


public class Buy_and_Sell_Stock {
    public static int Buy_and_Sell_StockMethods(int arr[]) {
        int maxprofit = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int profit = arr[j] - arr[i];
                System.out.println("arr[j] " + arr[j] + "-" + arr[i] + " = " + profit);
                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            }

            System.out.print("-------------------------------------------------------------");
            System.out.println();
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        System.out.println(Buy_and_Sell_StockMethods(new int[] { 7, 1, 5, 3, 6, 4 }));
    }
}
