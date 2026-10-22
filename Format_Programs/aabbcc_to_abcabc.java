package Format_Programs;

// Input:  aabbcc
// Output: abcabc

public class aabbcc_to_abcabc {
    public static void main(String[] args) {
        String str = "aabbcc";
        String result = "";

        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }

        for (int i = 1; i < str.length(); i += 2) {
            result += str.charAt(i);
        }

        System.out.println(result);
    }
}