package Format_Programs;


// abcdefghij
public class abcdefghij_to_acbd_egfhji {
    public static void main(String[] args) {
        String str="abcdefghij";
        String result="";

        int order1[]={0,2,1,3};
        for(int i=0;i<order1.length;i++)
        {
            result=result+str.charAt(order1[i]);
        }
        result=result+" ";
        int order2[]={4,6,5,7,9,8};
        for(int i=0;i<order2.length;i++)
        {
            result=result+str.charAt(order2[i]);
        }

        System.out.println(result);
    }
}
