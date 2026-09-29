package Arrays_and_Strings;


// Input:

// 5, 8, 10, 11, 3, 12

// Output:

// Numbers: 5 8 3


public class FindNumbersWhoseSquareIsLessThan_100 {
    public static void main(String[] args) {
        
        int arr[]={5, 8, 10, 11, 3, 12};

        System.out.print("Numbers : ");
        for(int i=0;i<arr.length;i++)
        {
            int square=arr[i]*arr[i];

            if(square<100)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
