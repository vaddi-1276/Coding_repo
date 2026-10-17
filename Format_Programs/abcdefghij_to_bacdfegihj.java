package Format_Programs;

public class abcdefghij_to_bacdfegihj {
    public static void main(String[] args) {
        String str = "abcdefghij";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == 4 || i == 7) {
                result = result + str.charAt(i + 1) + str.charAt(i);
                i++;
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
