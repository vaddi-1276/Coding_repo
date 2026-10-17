package Format_Programs;

public class qwertyui_to_wqeytriu {
    public static void main(String[] args) {
        String str = "qwertyui";
        String result = "";
        int order[] = { 1, 0, 2, 5, 4, 3, 7, 6 };
        for (int i = 0; i < order.length; i++) {
            result = result + str.charAt(order[i]);
        }
        System.out.println(result);
    }
}
