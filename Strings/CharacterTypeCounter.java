package Strings;

import java.util.ArrayList;

// Input:
// Java123@#

// Output:
// Alphabets = 4
// Digits = 3
// Special Characters = 2

class CharacterTypeUsingLoop {
    public static void countUsingLoop(String str) {
        int count_of_alphabets1 = 0;
        int count_of_digits1 = 0;
        int count_of_specialcharacters1 = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                count_of_alphabets1++;
            } else if (ch >= '0' && ch <= '9') {
                count_of_digits1++;
            } else {
                count_of_specialcharacters1++;
            }
        }
        System.out.println("Alphabets "+count_of_alphabets1);
        System.out.println("Digits "+count_of_digits1);
        System.out.println("Special Characters "+count_of_specialcharacters1);
    }
}

class CharacterTypeUsingCharacterMethods
{
    public static void countUsingCharacterMethods(String str)
    {
        int count_of_alphabets2=0;
        int count_of_digits2=0;
        int count_of_specialcharacters2=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(Character.isLetter(ch))
            {
                count_of_alphabets2++;
            }
            else if(Character.isDigit(ch))
            {
                count_of_digits2++;
            }
            else
            {
                count_of_specialcharacters2++;
            }
        }
        System.out.println("Alphabets count "+count_of_alphabets2);
        System.out.println("Digits count "+count_of_digits2);
        System.out.println("Special Characters count "+count_of_specialcharacters2);
    }
}

class CharacterTypeUsingArrayList{

    public static void countUsingArrayList(String str)
    {
        ArrayList<Character>list =new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            list.add(str.charAt(i));
        }
        System.out.println(list);

        int count_of_alphabets3=0;
        int count_of_digits3=0;
        int count_of_specialcharacters3=0;

        for(int i=0;i<list.size();i++)
        {
            char ch=list.get(i);
            if(Character.isLetter(ch))
            {
                count_of_alphabets3++;
            }
            else if(Character.isDigit(ch))
            {
                count_of_digits3++;
            }
            else
            {
                count_of_specialcharacters3++;
            }
        }

        System.out.println("alphabets "+count_of_alphabets3);
        System.out.println("digits "+count_of_digits3);
        System.out.println("special character "+count_of_specialcharacters3);
    }
}

public class CharacterTypeCounter {
    public static void main(String[] args) {
        CharacterTypeUsingLoop.countUsingLoop("JAVA!@#$*(1234567");
        CharacterTypeUsingCharacterMethods.countUsingCharacterMethods("JAVA!@#$*(1234567");
        CharacterTypeUsingArrayList.countUsingArrayList("JAVA!@#$*(1234567");
    }
}
