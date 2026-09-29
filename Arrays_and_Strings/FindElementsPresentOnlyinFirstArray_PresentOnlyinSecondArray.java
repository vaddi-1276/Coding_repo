package Arrays_and_Strings;

// Input

// Array 1: 10, 20, 30, 40
// Array 2: 20, 40, 50, 60

// Output

// 10 30

//Output:
//50 60

public class FindElementsPresentOnlyinFirstArray_PresentOnlyinSecondArray {
    public static void main(String[] args) {

        int arr1[] = { 10, 20, 30, 40 };
        int arr2[] = { 20, 40, 50, 60 };

        System.out.print("Elements Non Common in First Array : ");
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                System.out.print(arr1[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Elements Non Common in Second Array : ");

        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.println();
    }
}
