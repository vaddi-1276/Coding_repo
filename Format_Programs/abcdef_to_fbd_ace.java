package Format_Programs;

public class abcdef_to_fbd_ace {
    public static void main(String[] args) {
        String str = "abcdef";
        String result = "";

        result = result + str.charAt(5) + str.charAt(1) + str.charAt(3) + " " + str.charAt(0) + str.charAt(2)
                + str.charAt(4);

        System.out.println(result);
    }
}
