package Strings;

import java.util.ArrayList;

// Input:
// JAVA SELENIUM

// Output:
// java selenium

class LowercaseUsingCharacterAPI {
    public static void convertUsingCharacterAPI(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                result = result + " ";
            } else {
                result = result + Character.toLowerCase(ch);
            }
        }
        System.out.println(result);
    }
}

class LowercaseUsingASCII {
    public static void convertUsingASCII(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                result = result + " ";
            }

            else {
                result = result + (char) (ch + 32);
            }
        }
        System.out.println(result);
    }
}

class LowercaseUsingArrayList {
    public static void convertUsingArrayList(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        StringBuilder result=new StringBuilder();
        for(int i=0;i<list.size();i++)
        {
            char ch=list.get(i);
            if(ch==' ')
            {
                result.append(" ");
            }

            else{
                result.append((char)(ch+32));
            }
        }
        System.out.println(result);
    }
}

public class UppercaseToLowercaseConverter {
    public static void main(String[] args) {
        LowercaseUsingCharacterAPI.convertUsingCharacterAPI("JAVA SELENIUM");
        LowercaseUsingASCII.convertUsingASCII("JAVA SELENIUM");
        LowercaseUsingArrayList.convertUsingArrayList("PYTHON APPIUM");
    }
}
