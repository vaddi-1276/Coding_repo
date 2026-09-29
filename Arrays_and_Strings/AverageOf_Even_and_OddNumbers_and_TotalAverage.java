package Arrays_and_Strings;

// Input:

// 10, 15, 20, 25, 30, 35

public class AverageOf_Even_and_OddNumbers_and_TotalAverage {
    public static void main(String[] args) {

        int eventotal = 0;
        int oddtotal = 0;

        int evencount = 0;
        int oddcount = 0;

        int arr[] = { 10, 15, 20, 25, 30, 35 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                eventotal = eventotal + arr[i];
                evencount++;
            } else {
                oddtotal = oddtotal + arr[i];
                oddcount++;
            }
        }

        int total = eventotal + oddtotal;

        double EvenAverage = (double) eventotal / evencount;
        double OddAverage = (double) oddtotal / oddcount;
        double totalAverage = (double) total / arr.length;

        System.out.println("Even Total : " + eventotal);
        System.out.println("Even Average : " + EvenAverage);

        System.out.println("Odd Total : " + oddtotal);
        System.out.println("Odd Average : " + OddAverage);

        System.out.println("Total : " + total);
        System.out.println("Total Average : " + totalAverage);
    }
}
