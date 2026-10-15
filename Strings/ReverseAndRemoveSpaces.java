package Strings;

// Input:
// Java Selenium Python

// Output:
// Reverse = nohtyP muineleS avaJ
// Without Spaces = nohtyPmuineleSavaJ

class UsingForLoopReverseAndRemoveSpaces {
    public static void UsingForLoopReverseAndRemoveSpacesMethods(String str) {

        String withspaceString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                withspaceString = withspaceString + " ";
            } else {
                withspaceString = withspaceString + ch;
            }
        }
        System.out.println("Reverse = "+withspaceString);

        String withoutspaceString="";
        for(int i=0;i<withspaceString.length();i++)
        {
            char ch=withspaceString.charAt(i);
            if(ch==' ')
            {
                continue;
            }
            else
            {
                withoutspaceString=withoutspaceString+ch;
            }
        }
        System.out.println("Without Spaces = "+withoutspaceString);
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
        // UsingStringBuilderReverseAndRemoveSpaces
        // .UsingStringBuilderReverseAndRemoveSpacesMethods("Java Selenium Python");
    }
}
