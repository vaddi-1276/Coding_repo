package Arrays_and_Strings;


// Input

// 101, 234, 343, 456, 787, 890

// Output

// 101 343 787


public class FindNumbersEqualtoTheirReverse {
    public static void main(String[] args) {
        
        int arr[]={101, 234, 343, 456, 787, 890};
        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];
            int originalnum=num;
            int rev=0;
            while(originalnum>0)
            {
                int digit=originalnum%10;
                rev=rev*10+digit;
                originalnum=originalnum/10;
            }

            if(num==rev)
            {
                System.out.print(num+" ");
            }
        }
        System.out.println();
    }
}
