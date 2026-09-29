package Arrays_and_Strings;


// Input:

// 6, 8, 12, 15, 18, 20, 24

// Output:

// Elements: 6 12 18 24
// Sum: 60


public class FindElementsThatAreMultiplesofBoth_2and_3 {
    public static void main(String[] args) {
        
        int arr[]={6, 8, 12, 15, 18, 20, 24};
        int sum=0;

        System.out.print("Elements : ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0 && arr[i]%3==0)
            {
                System.out.print(arr[i]+" ");
                sum=sum+arr[i];
            }
        }
        System.out.println();
        System.out.println("Sum : "+sum);
    }
}
