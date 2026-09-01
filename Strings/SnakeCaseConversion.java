package Strings;

import java.util.ArrayList;

// Input:
// Java Selenium Testing

// Output:
// java_selenium_testing

class UsingchSnakeCaseConversion {
    public static void UsingchSnakeCaseConversionMethods(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                result = result + "_";
            } else if (ch >= 'A' && ch <= 'Z') {
                result = result + (char) (ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}

class UsingBuiltinFunctionSnakeCaseConversion {
    public static void UsingBuiltinFunctionSnakeCaseConversionMethods(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                result = result + "_";
            } else if (Character.isUpperCase(ch)) {
                result = result + Character.toLowerCase(ch);
            } else {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}

class UsingArrayListSnakeCaseConversion {
    public static void UsingArrayListSnakeCaseConversionMethods(String str) {

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
                result.append("_");
            }

            else if(Character.isUpperCase(ch))
            {
                result.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch))
            {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}

public class SnakeCaseConversion {
    public static void main(String[] args) {
        UsingchSnakeCaseConversion.UsingchSnakeCaseConversionMethods("Java Selenium Testing");
        UsingBuiltinFunctionSnakeCaseConversion.UsingBuiltinFunctionSnakeCaseConversionMethods("Java Selenium Testing");
        UsingArrayListSnakeCaseConversion.UsingArrayListSnakeCaseConversionMethods("Java Selenium Testing");
    }
}
