package Strings;

// Input:
// Java Selenium Automation

// Output:
// Java

class UsingTempVariableClass {
    public static void UsingTempVariableMethods(String str) {

        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].length() > words[j].length()) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println(words[0]);
        System.out.println(words[0].length());
    }
}

public class SmallestWord {
    public static void main(String[] args) {
        UsingTempVariableClass.UsingTempVariableMethods("Java Selenium Automation");
    }
}
