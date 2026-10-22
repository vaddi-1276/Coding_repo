package Format_Programs;

import java.util.Arrays;

public class abcde12345_to_a1b2c3d4e5 {
    public static void main(String[] args) {
        String str = "abcde12345";
        String result = "";
        int arr[] = new int[str.length()];

        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                arr[index] = ch;
                index = index + 2;
            }
        }

        index = 1;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                arr[index] = ch - '0';
                index = index + 2;
            }
        }

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result = result + (char) arr[i];
            } else {
                result = result + arr[i];
            }
        }

        System.out.println(result);
    }
}