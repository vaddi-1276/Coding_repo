package Format_Programs;

public class abcdefgh_to_abghcdef {
    public static void main(String[] args) {
        String str = "abcdefgh";
        int g_position = str.indexOf('g');
        int c_position = str.indexOf('c');
        String result = "";
        for (int i = 0; i < c_position; i++) {
            result = result + str.charAt(i);
        }
        for (int i = g_position; i < str.length(); i++) {
            result = result + str.charAt(i);
        }
        for (int i = c_position; i < g_position; i++) {
            result = result + str.charAt(i);
        }

        System.out.println(result);
    }
}
