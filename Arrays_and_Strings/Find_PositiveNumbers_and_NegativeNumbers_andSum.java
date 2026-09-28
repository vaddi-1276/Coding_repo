package Arrays_and_Strings;

// Input:

// -10, 20, -5, 30, -2, 40

public class Find_PositiveNumbers_and_NegativeNumbers_andSum {
    public static void main(String[] args) {

        int arr[] = { -10, 20, -5, 30, -2, 40 };

        int positivesum = 0;
        int negativesum = 0;

        System.out.print("Postive Numbers : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
                positivesum = positivesum + arr[i];
            }
        }
        System.out.println();
        System.out.println(positivesum);

        System.out.print("Negative Numbers : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
                negativesum = negativesum + arr[i];
            }
        }
        System.out.println();
        System.out.println(negativesum);
    }
}
