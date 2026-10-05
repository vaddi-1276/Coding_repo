package Algorthims;

import java.util.Arrays;

// Input:
// Array = [1, 2, 2, 2, 3, 4]
// Target = 2

// Output:
// Index : 1

public class FirstOccurrenceIndexPrint {

    public static int FirstOccurrenceIndexPrintMethods(int arr[],int value) {

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==value)
            {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        FirstOccurrenceIndexPrintMethods(new int[]{1, 2, 2, 2, 3, 4}, 2);
    }
}
