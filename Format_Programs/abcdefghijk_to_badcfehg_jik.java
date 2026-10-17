package Format_Programs;

// abcdefghijk 

// badcfehg jik

public class abcdefghijk_to_badcfehg_jik {
    public static void main(String[] args) {
        String str = "abcdefghijk";
        String result = "";
        int h_position = str.indexOf('h');
        // System.out.println(i_position);
        for (int i = 0; i < str.length(); i += 2) {
            if (i + 1 < str.length()) {
                result = result + str.charAt(i + 1) + str.charAt(i);
            } else {
                result = result + str.charAt(i);
            }

            if (h_position == i+1) {
                result = result + " ";
            }
        }
        System.out.println(result);
    }
}
