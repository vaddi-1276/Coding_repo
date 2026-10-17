package Format_Programs;

public class selenium_to_slnmeieu {
    public static void main(String[] args) {
        String str = "selenium";
        String result = "";

        // s e l e n i u m
        // 0 1 2 3 4 5 6 7

        // s l n m e i e u

        result = result + str.charAt(0) + str.charAt(2) +
                str.charAt(4) + str.charAt(7) + str.charAt(1) +
                str.charAt(5) + str.charAt(3) + str.charAt(6);

        System.out.println(result);

    }
}
