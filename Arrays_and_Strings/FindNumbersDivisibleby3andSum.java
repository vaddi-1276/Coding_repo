package Arrays_and_Strings;

// Input:

// 3, 7, 9, 12, 14, 18, 20

// Output:
// Numbers divisible by 3 : 3 9 12 18 
// 42

public class FindNumbersDivisibleby3andSum {
    public static void main(String[] args) {

        int arr[] = { 3, 7, 9, 12, 14, 18, 20 };
        int sum = 0;
        System.out.print("Numbers divisible by 3 : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.print(arr[i] + " ");
                sum = sum + arr[i];
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
