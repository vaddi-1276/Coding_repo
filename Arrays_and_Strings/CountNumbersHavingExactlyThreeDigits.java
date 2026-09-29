package Arrays_and_Strings;

// Input:

// 10, 100, 250, 5, 999, 45

//Output:

// 100,250,999

public class CountNumbersHavingExactlyThreeDigits {
    public static void main(String[] args) {
        
        int arr[]={10, 100, 250, 5, 999, 45};
        int count=0;
        System.out.print("Numbers : ");
        for(int i=0;i<arr.length;i++)
        {
            if(String.valueOf(arr[i]).length()==3)
            {
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Count : "+count);
    }
}
