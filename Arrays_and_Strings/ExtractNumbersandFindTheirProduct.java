package Arrays_and_Strings;

// Input

// Java 5 Selenium 3 API 4

// Output

// Numbers: 5 3 4
// Product: 60

public class ExtractNumbersandFindTheirProduct {
    public static void main(String[] args) {

        String str = "Java 5 Selenium 3 API 4";
        String words[] = str.split(" ");
        int product = 1;
        System.out.print("Numbers : ");
        for (int i = 0; i < words.length; i++) {
            if (Character.isDigit(words[i].charAt(0))) {
                System.out.print(words[i] + " ");
                product = product * Integer.parseInt(words[i]);
            }
        }
        System.out.println();
        System.out.println("Product : " + product);
    }
}
