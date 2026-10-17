package Format_Programs;

// a b c d e f g h
// 0 1 2 3 4 5 6 7

// a b e f c d g h
// 0 1 4 5 2 3 6 7


public class abcdefgh_to_abefcdgh {
    public static void main(String[] args) {
        String str = "abcdefgh";
        String result = "";
        int orders[] = { 0, 1, 4, 5, 2, 3, 6, 7 };
        for (int i = 0; i < orders.length; i++) {
            result = result + str.charAt(orders[i]);
        }
        System.out.println(result);
    }
}
