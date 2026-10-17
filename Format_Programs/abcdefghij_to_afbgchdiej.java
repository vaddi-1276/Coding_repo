package Format_Programs;

// a b c d e f g h i j
// 0 1 2 3 4 5 6 7 8 9

// a f b g c h d i e j
// 0 5 1 6 2 7 3 8 4 9
public class abcdefghij_to_afbgchdiej {
    public static void main(String[] args) {
        String str = "abcdefghij";
        String result = "";
        int order[] = { 0, 5, 1, 6, 2, 7, 3, 8, 4, 9 };

        for (int i = 0; i < order.length; i++) {
            result = result + str.charAt(order[i]);
        }
        System.out.println(result);
    }
}
