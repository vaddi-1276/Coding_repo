package Arrays_and_Strings;

// Input

// 123, 121, 456, 455, 789, 787

// Output

// 123 456 789


public class FindNumbersWithAllUniqueDigits {
    public static void main(String[] args) {
        
        int arr[]={123, 121, 456, 455, 789, 787};
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

            if(found==false)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
