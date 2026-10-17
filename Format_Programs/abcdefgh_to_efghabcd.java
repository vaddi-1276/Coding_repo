package Format_Programs;

public class abcdefgh_to_efghabcd {
    public static void main(String[] args) {
        String str = "abcdefgh";
        String result = "";
        int e_position = str.indexOf('e');

        for (int i = e_position; i < str.length(); i++) {
            result = result + str.charAt(i);
        }

        for (int i = 0; i < e_position; i++) {
            result = result + str.charAt(i);
        }

        System.out.println(result);
    }
}
