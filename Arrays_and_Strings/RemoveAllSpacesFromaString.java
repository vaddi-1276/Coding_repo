package Arrays_and_Strings;

// Input

// Java Selenium Automation

// Output

// JavaSeleniumAutomation

public class RemoveAllSpacesFromaString {
    public static void main(String[] args) {

        String str = "Java Selenium Automation";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            } else {
                result = result + ch;
            }

        }
        System.out.println(result);
    }
}
