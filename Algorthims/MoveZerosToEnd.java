package Algorthims;

// [0,1,0,3,12]

// [1,3,12,0,0]

import java.util.Arrays;

public class MoveZerosToEnd {

    public static int[] MoveZerosToEndmethods(int arr[]) {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==0 && arr[j]!=0)
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println(
                Arrays.toString(
                        MoveZerosToEndmethods(new int[] { 0, 1, 0, 3, 12 })));
    }
}