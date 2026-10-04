package Algorthims;

// [10,5,8,20,15]

// First Largest Number 20
// Second Largest Number 15

public class FirstLargestNumber_and_SecondLargestNumber {
    public static int FirstLargestNumberMethods(int arr[]) {

        int firstnumber = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstnumber) {
                firstnumber = arr[i];
            }
        }

        return firstnumber;
    }

    public static int SecondLargestNumberMethods(int arr[]) {

        int firstlargestnumber = Integer.MIN_VALUE;
        int secondlargestnumber = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>firstlargestnumber)
            {
                secondlargestnumber=firstlargestnumber;
                firstlargestnumber=arr[i];
            }

            else if(arr[i]>secondlargestnumber && firstlargestnumber!=arr[i])
            {
                secondlargestnumber=arr[i];
            }
        }

        return secondlargestnumber;
    }

    public static void main(String[] args) {
        System.out.println("First Largest Number "+FirstLargestNumberMethods(new int[] { 10, 5, 8, 20, 15 }));
        System.out.println("Second Largest Number "+SecondLargestNumberMethods(new int[] { 10, 5, 8, 20, 15 }));
    }
}
