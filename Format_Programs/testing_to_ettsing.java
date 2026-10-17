package Format_Programs;

// Input:  testing
// Output: ettsing

public class testing_to_ettsing {
    public static void main(String[] args) {
        String str = "testing";
        String result = "";

        for (int i = 0; i < str.length(); i += 2) {
            if (i == 0 || i == 2) {
                result = result + str.charAt(i + 1) + str.charAt(i);
            } else {
                result = result + str.charAt(i);

                if (i + 1 < str.length()) {
                    result = result + str.charAt(i + 1);
                }
            }
        }

        System.out.println(result);
    }
}