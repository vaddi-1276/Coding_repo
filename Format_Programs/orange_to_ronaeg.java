package Format_Programs;

// orange

// ro naeg


public class orange_to_ronaeg {
    public static void main(String[] args) {
        String str = "orange";
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            if (i + 1 < str.length()) {
                result = result + str.charAt(i + 1) + str.charAt(i);
            } else {
                result = result + str.charAt(i);
            }

            if(i==0)
            {
                result=result+" ";
            }
        }
        System.out.println(result);
    }
}
