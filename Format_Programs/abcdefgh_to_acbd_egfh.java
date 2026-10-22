package Format_Programs;

public class abcdefgh_to_acbd_egfh {
    public static void main(String[] args) {
        String str = "abcdefgh";
        String result = "";
        int order1[] = { 0, 2, 1, 3 };
        for (int i = 0; i < order1.length; i++) {
            result = result + str.charAt(order1[i]);
        }
        result = result + " ";
        int order2[] = { 4, 6, 5, 7 };
        for (int i = 0; i < order2.length; i++) {
            result = result + str.charAt(order2[i]);
        }
        System.out.println(result);
    }
}
