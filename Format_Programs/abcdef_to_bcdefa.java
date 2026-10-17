package Format_Programs;

public class abcdef_to_bcdefa {
    public static void main(String[] args) {
        String str = "abcdef";
        String result = "";
        char ch = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            result = result + str.charAt(i);
        }
        result = result + ch;
        System.out.println(result);
    }
}
