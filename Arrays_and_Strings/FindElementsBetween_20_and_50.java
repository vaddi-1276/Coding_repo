package Arrays_and_Strings;


// Input:

// 10, 20, 25, 35, 50, 60

// Output:

// Elements: 25 35


public class FindElementsBetween_20_and_50 {
    public static void main(String[] args) {
        
        int arr[]={10, 20, 25, 35, 50, 60};

        System.out.print("Elements : ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>20 && arr[i]<50)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
