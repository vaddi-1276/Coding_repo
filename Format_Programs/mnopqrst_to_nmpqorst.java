package Format_Programs;

public class mnopqrst_to_nmpqorst {
    public static void main(String[] args) {
        String str="mnopqrst";
        String result="";

        int order[]={1,0,3,4,2,5,6,7};
        for(int i=0;i<order.length;i++)
        {
            result=result+str.charAt(order[i]);
        }
        System.out.println(result);
    }
}
