package Format_Programs;

public class interview_to_viewinter {
    public static void main(String[] args) {
        String str = "interview";
        String result = "";
        int position = str.indexOf('v');

        for (int i = position; i < str.length(); i++) {
            result = result + str.charAt(i);
        }

        for (int i = 0; i < position; i++) {
            result = result + str.charAt(i);
        }

        System.out.println(result);
    }
}
