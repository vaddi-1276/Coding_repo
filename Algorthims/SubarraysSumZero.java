package Algorthims;

// [6,3,-1,-3,4,-2,2,4,6,-12,-7]

// 6

// Input: nums = [6,3,-1,-3,4,-2,2,4,6,-12,-7]

// Output: 6

// Explanation:
// There are 6 contiguous subarrays whose sum is equal to 0.

// We can efficiently find them using prefix sums.
// Whenever the same prefix sum occurs again, the elements
// between those two positions form a zero-sum subarray.

// Therefore, the total number of zero-sum subarrays is 6.

public class SubarraysSumZero {

    public static int SubarraysSumZeroMethods(int arr[]) {
        int count=1;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;

            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];

                if(sum==0)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(SubarraysSumZeroMethods(new int[] { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 }));
    }
}
