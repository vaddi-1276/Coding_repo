package Format_Programs;

// a b c d e f g h i
// 0 1 2 3 4 5 6 7 8

// a d g b e h c f i
// 0 3 6 1 4 7 2 5 8

public class abcdefghi_to_adgbehcfi {
    public static void main(String[] args) {
        String str = "abcdefghi";
        String result = "";

        for (int i = 0; i < 3; i++) {
            for (int j = i; j < str.length(); j += 3) {
                result = result + str.charAt(j);
            }
        }

        System.out.println(result);
    }
}
