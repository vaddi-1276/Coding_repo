package Format_Programs;

// qwerty

// wqetyr

public class qwerty_to_wqetyr {
    public static void main(String[] args) {
        String str = "qwerty";
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            if (i == 0) {
                result = result + str.charAt(i + 1) + str.charAt(i);
            } else if (i == 2) {
                result = result + str.charAt(i) + str.charAt(i + 2);
            } else {
                result = result + str.charAt(i + 1) + str.charAt(i - 1);
            }
        }
        System.out.println(result);
    }
}
