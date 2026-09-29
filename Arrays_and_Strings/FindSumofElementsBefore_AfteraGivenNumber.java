package Arrays_and_Strings;

//Before 

// Input:

// 10, 20, 30, 40, 50

// Given Number: 40

// Output:

// Elements: 10 20 30
// Sum: 60

//After
// Input:

// 10, 20, 30, 40, 50

// Given Number: 30

// Output:

// Elements: 40 50
// Sum: 90

public class FindSumofElementsBefore_AfteraGivenNumber {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 };
        int beforesum = 0;
        int aftersum = 0;
        int beforenumber = 40;
        int afternumber = 30;

        System.out.print("Before Given Number Elements : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < beforenumber) {
                System.out.print(arr[i] + " ");
                beforesum = beforesum + arr[i];
            }
        }
        System.out.println();
        System.out.println(" Before Given Number Sum : " + beforesum);

        System.out.print("After Given Number Elements : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > afternumber) {
                System.out.print(arr[i] + " ");
                aftersum = aftersum + arr[i];
            }
        }
        System.out.println();
        System.out.println(" After Given Number Sum : " + aftersum);
    }
}
