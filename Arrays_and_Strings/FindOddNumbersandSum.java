package Arrays_and_Strings;

// Input:

// 11, 12, 13, 14, 15, 16

// Output:

// Odd Numbers: 11 13 15
// Sum: 39


public class FindOddNumbersandSum {
    public static void main(String[] args) {
        
        int arr[]={11, 12, 13, 14, 15, 16};
        int oddsum=0;
        System.out.print("Odd Numbers : ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+" ");
                oddsum=oddsum+arr[i];
            }
        }
        System.out.println();
        System.out.println(oddsum);
    }
}
