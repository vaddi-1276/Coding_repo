package Algorthims;


// [1,1,0,1,1,1]

// 3

public class MaximumConsecutive_1s {
    public static int MaximumConsecutive_1sMethods(int arr[]) {
        
        int count=0;
        int MaximumConsecutive_1s=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;

                if(count>MaximumConsecutive_1s)
                {
                    MaximumConsecutive_1s=count;
                }
            }
            else
            {
                count=0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(MaximumConsecutive_1sMethods(new int[]{1,1,0,1,1,1,1,1}));
    }
}
