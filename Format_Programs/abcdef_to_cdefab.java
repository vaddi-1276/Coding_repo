package Format_Programs;

public class abcdef_to_cdefab {
    public static void main(String[] args) {
        String str="abcdef";
        String result="";

        char firstchar=str.charAt(0);
        char secondchar=str.charAt(1);

        for(int i=2;i<str.length();i++)
        {
            result=result+str.charAt(i);
        }

        result=result+firstchar+secondchar;
        System.out.println(result);
    }
}
