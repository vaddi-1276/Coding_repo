package Arrays_and_Strings;

// Input

// selenium

// Output

// eeilmnsu

public class SortCharactersofaStringWithoutArraysSort {
    public static void main(String[] args) {

        String str = "selenium";
        char arr[] = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
        }
        System.out.println(result);
    }
}
