package Arrays_and_Strings;

// Greater Than Previous Element

// Input:

// 10, 20, 15, 30, 25, 40

// Output:

// 20 30 40

// Smaller Than Previous Element

// Input:

// 50, 40, 60, 30, 20, 70

// Output:

// 40 30 20

public class FindElementsGreaterThanTheirPreviousElement {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 15, 30, 25, 40 };
        System.out.print("Greater Than Previous Element : ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        int arr1[]={50, 40, 60, 30, 20, 70};
        System.out.print("Smaller Than Previous Element : ");
        for(int i=1;i<arr1.length;i++)
        {
            if(arr1[i]<arr1[i-1])
            {
                System.out.print(arr1[i]+" ");
            }
        }
        System.out.println();
    }
}
