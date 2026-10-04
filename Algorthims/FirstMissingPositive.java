package Algorthims;

// [3,4,-1,1]

// 2


public class FirstMissingPositive {
    public static void main(String[] args) {
        
        int arr[]={3,4,-1,1};

        for(int i=1;i<arr.length+1;i++)
        {
            boolean found=false;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==i)
                {
                    found=true;
                    break;
                }
            }
            if(found==false)
            {
                System.out.println(i);
            }
        }
    }
}
