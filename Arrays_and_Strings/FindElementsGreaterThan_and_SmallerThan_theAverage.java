package Arrays_and_Strings;

// Input:

// 10, 20, 30, 40, 50

// Output:

// Average: 30
// Elements: 40 50

public class FindElementsGreaterThan_and_SmallerThan_theAverage {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int Average = sum / arr.length;
        System.out.println("Average : " + Average);
        System.out.print("Elements Greater Than Average : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Average) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Elements Less Than Average : ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<Average)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
