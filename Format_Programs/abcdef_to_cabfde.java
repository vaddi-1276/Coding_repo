package Format_Programs;

public class abcdef_to_cabfde {
    public static void main(String[] args) {
        String str = "abcdefg";
        String result = "";

        for (int i = 0; i < str.length(); i += 3) {
            if (i + 1 < str.length()) {
                result = result + str.charAt(i + 2) + str.charAt(i) + str.charAt(i + 1);
            }
            else
            {
                result=result+str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
