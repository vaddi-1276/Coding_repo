package Algorthims;

// [1, 3, 4, 2, 2, 5, 5, 7, 7, 7, 9, 9, 9, 9]

// 2
// 5
// 7
// 9

public class DuplicateNumber {
    public static int DuplicateNumberMethods(int arr[]) {

        for(int i=0;i<arr.length;i++)
        {
            boolean found=false;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    found=true;
                    break;
                }
            }

            if(found)
            {
                continue;
            }

            int count=1;
            for(int k=i+1;k<arr.length;k++)
            {
                if(arr[k]==arr[i])
                {
                    count++;
                }
            }

            if(count>1)
            {
                System.out.println(arr[i]);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        DuplicateNumberMethods(new int[] { 1, 3, 4, 2, 2, 5, 5, 7, 7, 7, 9, 9, 9, 9 });
    }
}
