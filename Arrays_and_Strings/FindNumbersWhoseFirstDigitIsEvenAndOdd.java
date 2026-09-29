package Arrays_and_Strings;

// Input:

// 12, 35, 46, 71, 82, 95


public class FindNumbersWhoseFirstDigitIsEvenAndOdd {
    
    public static void main(String[] args) {
        int arr[]={12, 35, 46, 71, 82, 95};

        System.out.print("Even Numbers Starting : ");
        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];

            while(num>=10)
            {
                num=num/10;
            }

            if(num%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();

        System.out.print("Odd Numbers Starting : ");

        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];

            while(num>=10)
            {
                num=num/10;
            }

            if(num%2!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
