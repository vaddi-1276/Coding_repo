package Format_Programs;

public class a1b2c3d4e5_to_acebd {
    public static void main(String[] args) {
        String str = "a1b2c3d4e5";
        String onlycharacters = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                onlycharacters = onlycharacters + ch;
            }
        }

        int order[] = { 0, 2, 4, 1, 3 };
        String result = "";
        for (int i = 0; i < order.length; i++) {
            result = result + onlycharacters.charAt(order[i]);
        }

        System.out.println(result);
    }
}
