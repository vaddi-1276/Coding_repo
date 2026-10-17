package Format_Programs;

// a b c d e f g h i j
// 0 1 2 3 4 5 6 7 8 9

// e f g h i j a b c d
// 4 5 6 7 8 9 0 1 2 3

public class abcdefghij_to_efghijabcd {
    public static void main(String[] args) {
        String str = "abcdefghij";
        String result = "";

        int orders[] = { 4, 5, 6, 7, 8, 9, 0, 1, 2, 3 };

        for (int i = 0; i < orders.length; i++) {
            result = result + str.charAt(orders[i]);
        }
        System.out.println(result);
    }
}
