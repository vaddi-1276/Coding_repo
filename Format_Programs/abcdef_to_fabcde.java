package Format_Programs;

// a b c d e f

// f a b c d e
public class abcdef_to_fabcde {
    public static void main(String[] args) {
        String str = "abcdef";
        String result = "";
        char ch = str.charAt(str.length() - 1);
        result = result + ch;

        for(int i=0;i<str.length()-1;i++)
        {
            result=result+str.charAt(i);
        }
        System.out.println(result);
    }
}
