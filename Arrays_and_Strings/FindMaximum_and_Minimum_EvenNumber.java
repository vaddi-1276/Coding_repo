package Arrays_and_Strings;

import java.util.Arrays;

// Input:

// 15, 22, 37, 48, 61, 72, 19

public class FindMaximum_and_Minimum_EvenNumber {

    public static void main(String[] args) {

        int arr[] = { 15, 22, 37, 48, 61, 72, 19 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int MaximumEvenNumber = Integer.MIN_VALUE;
        int MinimumEvenNumber = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                if(arr[i]>MaximumEvenNumber)
                {
                    MaximumEvenNumber=arr[i];
                }
            }
        }
        System.out.println("Maximum Even Number : "+MaximumEvenNumber);

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                if(arr[i]<MinimumEvenNumber)
                {
                    MinimumEvenNumber=arr[i];
                }
            }
        }
        System.out.println("Minimum Even Number : "+MinimumEvenNumber);
    }
}
