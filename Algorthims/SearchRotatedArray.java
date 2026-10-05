package Algorthims;

// [4,5,6,7,0,1,2], Target=0

// Index : 4

public class SearchRotatedArray {
    public static int SearchRotatedArrayMethods(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(SearchRotatedArrayMethods(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
    }
}
