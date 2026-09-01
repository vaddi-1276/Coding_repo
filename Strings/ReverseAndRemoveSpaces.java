package Strings;

// Input:
// Java Selenium Python

// Output:
// Reverse = nohtyP muineleS avaJ
// Without Spaces = nohtyPmuineleSavaJ

class UsingForLoopReverseAndRemoveSpaces {
    public static void UsingForLoopReverseAndRemoveSpacesMethods(String str) {

        String words[] = str.split(" ");

        String ReverseString = "";

        for (int i = words.length - 1; i >= 0; i--) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                ReverseString = ReverseString + words[i].charAt(j);
            }
            ReverseString = ReverseString + " ";
        }
        System.out.println("Reverse = " + ReverseString);
        String withoutspaces = "";

        for (int i = 0; i < ReverseString.length(); i++) {
            char ch = ReverseString.charAt(i);

            if (ch == ' ') {
                continue;
            } else {
                withoutspaces = withoutspaces + ch;
            }
        }
        System.out.println("Without Spaces = " + withoutspaces);
    }
}

class UsingStringBuilderReverseAndRemoveSpaces {
    public static void UsingStringBuilderReverseAndRemoveSpacesMethods(String str) {
        String words[] = str.split(" ");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                result = result + words[i].charAt(j);
            }
            result = result + " ";
        }
        System.out.println("Reverse = " + result);

        String withoutspacesString = "";
        for (int i = 0; i < result.length(); i++) {

            char ch = result.charAt(i);

            if (ch == ' ') {
                continue;
            } else {
                withoutspacesString = withoutspacesString + ch;
            }
        }
        System.out.println("without Spaces = " + withoutspacesString);
    }
}

public class ReverseAndRemoveSpaces {
    public static void main(String[] args) {
        UsingForLoopReverseAndRemoveSpaces.UsingForLoopReverseAndRemoveSpacesMethods("Java Selenium Python");
        UsingStringBuilderReverseAndRemoveSpaces
                .UsingStringBuilderReverseAndRemoveSpacesMethods("Java Selenium Python");
    }
}
