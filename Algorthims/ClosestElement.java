package Algorthims;

// [1,4,6,8,10], Target=7

// 6

public class ClosestElement {
    public static int ClosestElementMethods(int arr[]) {
        int value=-1;
        int target=7;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=target)
            {
                value=arr[i];
            }
            else
            {
                break;
            }
        }
        return  value;
    }
    public static void main(String[] args) {
        System.out.println(ClosestElementMethods(new int[]{1,4,8,10} ));
    }
}
