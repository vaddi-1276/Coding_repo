package Format_Programs;

public class abcdef_to_badcfe {
    public static void main(String[] args) {
        String str = "abcdefg";
        String result = "";

        for (int i = 0; i < str.length(); i += 2) {
            if(i+1<str.length())
            {
                result = result + str.charAt(i + 1) + str.charAt(i);
            }
            else
            {
                result=result+str.charAt(i);
            }
        }

        System.out.println(result);
    }
}
