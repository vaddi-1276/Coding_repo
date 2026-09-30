package Arrays_and_Strings;

// Input

// abcdef

// Output

// ebcdaf

public class ReverseOnlyCharactersatEvenPositions {
    public static void main(String[] args) {
        String str = "abcdef";
        String evenpositionString = "";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                evenpositionString = evenpositionString + str.charAt(i);
            }
        }
        String reverseevenpositionString = "";
        for (int i = evenpositionString.length() - 1; i >= 0; i--) {
            reverseevenpositionString = reverseevenpositionString + evenpositionString.charAt(i);
        }

        int index = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result = result + reverseevenpositionString.charAt(index++);
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
