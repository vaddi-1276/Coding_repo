package Format_Programs;

public class iamvaddi_to_aivmdaid {
    public static void main(String[] args) {
        String str="iamvaddi";
        String result="";

        for(int i=0;i<str.length();i+=2)
        {
            result=result+str.charAt(i+1)+str.charAt(i);
        }
        System.out.println(result);
    }
}
