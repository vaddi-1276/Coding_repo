package Strings;

// Input:
// abcdefgh, N=3

// Output:
// cbafedh

class ReverseGroupsUsingLoop {
    public static void reverseUsingLoop(String str) {
        String result = "";
        int position = 3;
        for (int i = 0; i < str.length(); i += position) {
            int end = Math.min(i + position - 1, str.length() - 1);
            for (int j = end; j >= i; j--) {
                result = result + str.charAt(j);
            }
        }
        System.out.println(result);
    }
}

class ReverseGroupsUsingSubstring {
    public static void reverseUsingSubstring(String str) {

        int position = 3;
        String result = "";
        for (int i = 0; i < str.length(); i+=position) {
            int end = Math.min(i + position, str.length());
            result = result + new StringBuilder(str.substring(i, end)).reverse();
        }
        System.out.println(result);
    }
}

public class ReverseInGroupsOfN {
    public static void main(String[] args) {
        ReverseGroupsUsingLoop.reverseUsingLoop("abcdefgh");
        ReverseGroupsUsingSubstring.reverseUsingSubstring("abcdefgh");
    }
}
