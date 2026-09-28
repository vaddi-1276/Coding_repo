package Arrays_and_Strings;

// Input:

// 121, 123, 454, 567, 777, 890

// Output:
// Palindrome Numbers : 121 454 777 
public class FindPalindromeNumbers {
    public static void main(String[] args) {
        
        int arr[]={121, 123, 454, 567, 777, 890};
        System.out.print("Palindrome Numbers : ");
        for(int i=0;i<arr.length;i++)
        {
            int rev=0;
            int num=arr[i];
            int temp=num;
            while(num>0)
            {
                int digit=num%10;
                rev=rev*10+digit;
                num=num/10;
            }
            if(temp==rev)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
