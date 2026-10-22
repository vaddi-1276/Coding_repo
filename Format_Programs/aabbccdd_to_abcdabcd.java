package Format_Programs;

public class aabbccdd_to_abcdabcd {
    public static void main(String[] args) {
        String str = "aabbccdd";
        String result = "";

        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }

        for (int i = 1; i < str.length(); i += 2) {
            result += str.charAt(i);
        }

        System.out.println(result);
    }
}
