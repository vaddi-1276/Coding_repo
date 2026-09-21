package Strings;

import java.util.ArrayList;

// Input: Java Selenium Automation
// Output: Spaces = 2

class UsingNestedForLoopCountSpaces {
    public static void UsingNestedForLoopCountSpacesMethods(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                count++;
            }
        }
        System.out.println("Spaces = " + count);
    }
}

class UsingArrayListCountSpaces {
    public static void UsingArrayListCountSpacesMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (ch == ' ') {
                count++;
            }
        }
        System.out.println("Spaces = " + count);
    }
}

class UsingRecursionCountSpaces
{
    public static void UsingRecursionCountSpacesMethods(String str,int index,int count) {
        
        if(index==str.length())
        {
            System.out.println("Spaces = "+count);
            return;
        }
        char ch=str.charAt(index);
        if(ch==' ')
        {
            count++;
        }
        UsingRecursionCountSpacesMethods(str, index+1, count);
    }
}
public class CountSpaces {
    public static void main(String[] args) {
        UsingNestedForLoopCountSpaces.UsingNestedForLoopCountSpacesMethods("Java Selenium Automation");
        UsingArrayListCountSpaces.UsingArrayListCountSpacesMethods("Java Selenium Automation Learning");
        UsingRecursionCountSpaces.UsingRecursionCountSpacesMethods("Java Selenium Python Automation Learning", 0, 0);
    }
}
