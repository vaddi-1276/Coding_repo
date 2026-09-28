package Arrays_and_Strings;

// Input:

// 20, 55, 70, 40, 90, 35, 60

// Output:

// Numbers: 55 70 90 60


public class FindNumbersGreaterThan_50_andSum {
    public static void main(String[] args) {
        
        int arr[]={20, 55, 70, 40, 90, 35, 60};
        int sum=0;
        int count=0;
        System.out.print("Numbers Greater Than 50 : ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>50)
            {
                System.out.print(arr[i]+" ");
                count++;
                sum=sum+arr[i];
            }
        }
        System.out.println();
        System.out.println(sum);
        System.out.println("COunt of Numbers Greater Than 50 : "+count);
    }
}
