package Arrays_and_Strings;

// Input

// 122, 345, 455, 678, 999, 123

// Output

// 122 455 999


public class FindNumbersContainingRepeatedDigits {
    public static void main(String[] args) {
        
        int arr[]={122, 345, 455, 678, 999, 123};

        for(int i=0;i<arr.length;i++)
        {
            String str=String.valueOf(arr[i]);
            boolean found=false;

            for(int j=0;j<str.length();j++)
            {
                for(int k=j+1;k<str.length();k++)
                {
                    if(str.charAt(j)==str.charAt(k))
                    {
                        found=true;
                        break;
                    }
                }
                if(found)
                {
                    continue;
                }
            }
            if(found==true)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
