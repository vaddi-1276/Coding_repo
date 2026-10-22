package Format_Programs;

// a b c d e f g h
// 0 1 2 3 4 5 6 7

// b a d c _ h g f e
// 1 0 3 2   7 6 5 4
public class abcdefgh_to_badc_hgfe {
    public static void main(String[] args) {
        String str="abcdefgh";
        String result="";
       
        int order1[]={1,0,3,2};
        for(int i=0;i<order1.length;i++)
        {
            result=result+str.charAt(order1[i]);
        }

        result=result+" ";
        int order2[]={7 ,6,5,4};
        for(int i=0;i<order2.length;i++)
        {
            result=result+str.charAt(order2[i]);
        }

        System.out.println(result);
    }
}
