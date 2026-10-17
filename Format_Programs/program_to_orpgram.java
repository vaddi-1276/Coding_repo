package Format_Programs;

public class program_to_orpgram {
    public static void main(String[] args) {
        String str = "program";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                result = result + str.charAt(i + 2);
            } else if (i == 2) {
                result = result + str.charAt(i - 2);
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
