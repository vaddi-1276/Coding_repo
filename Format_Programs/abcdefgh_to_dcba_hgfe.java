package Format_Programs;

public class abcdefgh_to_dcba_hgfe {
    public static void main(String[] args) {
        String str = "abcdefgh";
        String result = "";
        int d_position = str.indexOf('d');
        int h_position = str.indexOf('h');

        for (int i = d_position; i >= 0; i--) {
            result = result + str.charAt(i);
        }

        result = result + " ";

        for (int i = h_position; i > d_position; i--) {
            result = result + str.charAt(i);
        }
        System.out.println(result);
    }
}
