package Format_Programs;

// a b c d e f g h
// 0 1 2 3 4 5 6 7

// h d b f g e c a
// 7 3 1 5 6 4 2 0

public class abcdefgh_to_hdbfgeca {
    public static void main(String[] args) {
        String str = "abcdefgh";
        String result = "";

        int orders[] = { 7, 3, 1, 5, 6, 4, 2, 0 };
        for (int i = 0; i < orders.length; i++) {
            result = result + str.charAt(orders[i]);
        }

        System.out.println(result);
    }
}
