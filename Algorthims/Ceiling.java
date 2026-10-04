package Algorthims;

// What is Ceiling?
// The ceiling is the smallest number in the array that is greater than or equal to the target.
// For target 5:
// 1  → less than 5
// 2  → less than 5
// 4  → less than 5
// 6  → greater than 5  ← Answer
// 10 → greater than 5


// [1,2,4,6,10], Target=5

// 6

public class Ceiling {
    
    public static void main(String[] args) {
        int arr[]={1,2,4,6,10};
        int value=5;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=value)
            {
                System.out.println(arr[i]+" ");
                break;
            }
        }
    }
}
