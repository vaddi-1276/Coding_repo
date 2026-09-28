package Arrays_and_Strings;

// Input:

// 5, 12, 8, 45, 100, 67, 3

// Output:

// Two Digit Numbers: 12 45 67
// Count: 3


public class FindNumbersHavingTwoDigits {
    public static void main(String[] args) {
        
        int arr[]={5, 12, 8, 45, 100, 67, 3};
        int count=0;
        System.out.print("Two Digit Numbers: ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=10 && arr[i]<=99)
            {
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Count : "+count);
    }
}
