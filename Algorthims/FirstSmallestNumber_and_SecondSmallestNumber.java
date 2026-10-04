package Algorthims;


// [10,5,8,20,15]

// First Smallest Number 5
// Second Smallest Number 8


public class FirstSmallestNumber_and_SecondSmallestNumber {
    public static int FirstSmallestNumberMethods(int arr[]) {

        int firstsmallestnumber = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstsmallestnumber) {
                firstsmallestnumber = arr[i];
            }
        }

        return firstsmallestnumber;
    }

        public static int SecondSmallestNumberMethods(int arr[]) {

        int firstsmallestnumber = Integer.MAX_VALUE;
        int secondsmallestnumber=Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstsmallestnumber) {
                secondsmallestnumber=firstsmallestnumber;
                firstsmallestnumber = arr[i];
            }

            else if(arr[i]<secondsmallestnumber && firstsmallestnumber!=arr[i])
            {
                secondsmallestnumber=arr[i];
            }
        }

        return secondsmallestnumber;
    }

    public static void main(String[] args) {
        System.out.println("First Smallest Number "+FirstSmallestNumberMethods(new int[]{10,5,8,20,15}));
        System.out.println("Second Smallest Number "+SecondSmallestNumberMethods(new int[]{10,5,8,20,15}));
    }
}
