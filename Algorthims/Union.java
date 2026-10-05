package Algorthims;

// [1,2,3], [2,3,4]

// [1,2,3,4]
public class Union {

    public static void main(String[] args) {

        int arr1[] = { 1, 1, 1, 2, 2, 2, 2, 3, 3, 3 };
        int arr2[] = { 2, 3, 4, 4, 4, 4, 5, 5 };

        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (arr1[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }

            System.out.print(arr1[i] + " ");
        }

        for(int i=0;i<arr2.length;i++)
        {
            boolean found=false;
            for(int j=0;j<arr1.length;j++)
            {
                if(arr2[i]==arr1[j])
                {
                    found=true;
                    break;
                }
            }
            if(found)
            {
                continue;
            }

            boolean duplicate=false;
            for(int k=0;k<i;k++)
            {
                if(arr2[k]==arr2[i])
                {
                    duplicate=true;
                    break;
                }
            }

            if(duplicate==false)
            {
                System.out.print(arr2[i]+" ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}