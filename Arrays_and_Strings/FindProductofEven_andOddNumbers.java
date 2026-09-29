package Arrays_and_Strings;

// Input:

// 2, 3, 4, 5, 6

public class FindProductofEven_andOddNumbers {
    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 5, 6 };
        int evenproduct = 1;
        System.out.print("Even Numbers : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                evenproduct = evenproduct * arr[i];
            }
        }
        System.out.println();
        System.out.println("Even Numbers Product : " + evenproduct);

        int oddproduct = 1;
        System.out.print("Odd Numbers : ");
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
                oddproduct = oddproduct * arr[i];
            }
        }
        System.out.println();
        System.out.println("Odd Numbers Product : " + oddproduct);
    }
}
