package Algorthims;

// [4,5,6,7,0,1,2]

// Smallest number in Array : 0

public class SmallestinRotatedArray {
    public static int SmallestinRotatedArrayMethods(int arr[]) {
        int smallestnumber=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smallestnumber)
            {
                smallestnumber=arr[i];
            }
        }
        return smallestnumber;
    }
    public static void main(String[] args) {
        System.out.println(SmallestinRotatedArrayMethods(new int[]{4,5,6,7,0,-1,1,2}));
    }
}
