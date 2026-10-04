package Arrays_and_Strings;

// Input

// 121, 245, 363, 478, 515, 672

// Output

// 121 363 515

public class FindNumbersWithEqualFirstandLastDigits {
    public static void main(String[] args) {
        int arr[] = { 121, 245, 363, 478, 515, 672 };
        for (int i = 0; i < arr.length; i++) {
            String str = String.valueOf(arr[i]);
            char firstchar = str.charAt(0);
            char lastchar = str.charAt(str.length() - 1);

            if (firstchar == lastchar) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
