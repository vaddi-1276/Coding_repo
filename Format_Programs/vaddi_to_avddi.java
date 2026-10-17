package Format_Programs;

public class vaddi_to_avddi {
    public static void main(String[] args) {
        String str = "vaddi";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                result = result + str.charAt(i + 1);
            }

            else if (i == 1) {
                result = result + str.charAt(i - 1);
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
