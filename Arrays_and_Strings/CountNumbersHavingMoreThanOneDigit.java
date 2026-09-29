package Arrays_and_Strings;

// Input:

// 5, 12, 7, 45, 8, 100

// Output:

// Numbers: 12 45 100
// Count: 3

public class CountNumbersHavingMoreThanOneDigit {
    public static void main(String[] args) {
        int arr[] = { 5, 12, 7, 45, 8, 100 };
        int count=0;
        System.out.print("Numbers : ");
        for(int i=0;i<arr.length;i++)
        {
            if(String.valueOf(arr[i]).length()>1)
            {
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Count : "+count);
    }
}
