package Format_Programs;

public class aabbccddee_to_abcdeabcde {
    public static void main(String[] args) {
        String str = "aabbccddee";
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result = result + str.charAt(i);
        }
        for (int i = 1; i < str.length(); i += 2) {
            result = result + str.charAt(i);
        }
        System.out.println(result);
    }
}
