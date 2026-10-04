package Algorthims;

// [3,2,7,10]

// 13


public class MaximumSumNonAdjacent {
    public static int MaximumSumNonAdjacentMethods(int arr[]) {
        
        int previousnumber=0;
        int prepreviousnumber=0;
        // int arr[]={3,2,7,10};

        for(int i=0;i<arr.length;i++)
        {
            int currentnumber=Math.max(previousnumber,prepreviousnumber+arr[i]);

            prepreviousnumber=previousnumber;
            previousnumber=currentnumber;
        }
        return previousnumber; 
    }
    public static void main(String[] args) {
        System.out.println(MaximumSumNonAdjacentMethods(new int[]{3,2,7,10}));
    }
}
