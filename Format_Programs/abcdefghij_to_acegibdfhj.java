package Format_Programs;

// a b c d e f g h i j
// 0 1 2 3 4 5 6 7 8 9

// a c e g i b d f h j
// 0 2 4 6 8 1 3 5 7 9

public class abcdefghij_to_acegibdfhj {
    public static void main(String[] args) {
        String str = "abcdefghij";
        String result = "";
        int order[] = { 0, 2, 4, 6, 8, 1, 3, 5, 7, 9 };

        for (int i = 0; i < order.length; i++) {
            result = result + str.charAt(order[i]);
        }
        System.out.println(result);
    }
}
