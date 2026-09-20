package Strings;

// Input: programming
// Output: p, r, g, r, m, m, n, g

class UsingForLoopPrintConsonantsOrder {
    public static void UsingForLoopPrintConsonantsOrderMethods(String str) {

        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < str.length(); i++) {
            boolean found = false;
            for (int j = 0; j < vowels.length; j++) {

                if (str.charAt(i) == vowels[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(str.charAt(i));
            }
        }
    }
}

class UsingRecursionPrintConsonantsOrder {
    public static void UsingRecursionPrintConsonantsOrderMethods(String str, int index) {

        if (index == str.length()) {
            return;
        }
        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
        boolean found = false;
        for (int i = 0; i < vowels.length; i++) {
            if (str.charAt(index) == vowels[i]) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(str.charAt(index));
        }
        UsingRecursionPrintConsonantsOrderMethods(str, index + 1);
    }
}

public class PrintConsonantsOrder {
    public static void main(String[] args) {
       UsingForLoopPrintConsonantsOrder.UsingForLoopPrintConsonantsOrderMethods("programming");
        UsingRecursionPrintConsonantsOrder.UsingRecursionPrintConsonantsOrderMethods("programming", 0);
    }
}
