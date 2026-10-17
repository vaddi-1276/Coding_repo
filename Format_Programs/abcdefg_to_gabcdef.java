package Format_Programs;

public class abcdefg_to_gabcdef {
    public static void main(String[] args) {
        String str = "abcdefg";
        String result = "";
        char ch = str.charAt(str.length() - 1);
        result = result + ch;

        for (int i = 0; i < str.length() - 1; i++) {
            result = result + str.charAt(i);
        }
        System.out.println(result);
    }
}
