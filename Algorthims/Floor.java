package Algorthims;


// Input:
// Array = [1, 2, 4, 6, 10]
// Target = 5

// Output:
// 4

// What is Floor?
// The floor is the largest number in the array that is less than or equal to the target.


public class Floor {
    public static void main(String[] args) {
        
        int arr[]={1, 2, 4, 6, 10};
        int value=10;
        int floor=-1;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=value)
            {
               floor=arr[i];
            }

            else
            {
                break;
            }
        }
        System.out.println(floor);
    }
}
