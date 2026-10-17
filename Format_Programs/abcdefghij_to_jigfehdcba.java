package Format_Programs;

// a b c d e f g h i j
// 0 1 2 3 4 5 6 7 8 9

// j i g f e h d c b a
// 9 8 6 5 4 7 3 2 1 0
public class abcdefghij_to_jigfehdcba {
    public static void main(String[] args) {
        String str = "abcdefghij";
        String result = "";

        int orders[] = { 9, 8, 6, 5, 4, 7, 3, 2, 1, 0 };
        for (int i = 0; i < orders.length; i++) {
            result = result + str.charAt(orders[i]);
        }
        System.out.println(result);
    }
}
