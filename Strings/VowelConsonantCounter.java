package Strings;

import java.util.ArrayList;

// Input:
// automation

// Output:
// Vowels = 6
// Consonants = 4

class VowelConsonantUsingLoop{
    public static void countUsingLoop(String str)
    {
        int vowelsCount1=0;
        int consanstsCount1=0;

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowelsCount1++;
            }
            else
            {
                consanstsCount1++;
            }
        }
        System.out.println("Vowels Count "+vowelsCount1);
        System.out.println("Consants Count "+consanstsCount1);
    }
}


class VowelConsonantUsingArrayList
{
    public static void countUsingArrayList(String str)
    {
        ArrayList<Character>list=new ArrayList<>();
        int vowelsCount2=0;
        int consanstsCount2=0;
        for(int i=0;i<str.length();i++)
        {
            list.add(str.charAt(i));
        }
        System.out.println(list);

        for(int i=0;i<list.size();i++)
        {

            char ch=list.get(i);

            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowelsCount2++;
            }
            else{
                consanstsCount2++;
            }
        }
        System.out.println(vowelsCount2);
        System.out.println(consanstsCount2);
    }
}
public class VowelConsonantCounter {
    public static void main(String[] args) {
        VowelConsonantUsingLoop.countUsingLoop("automation");
        VowelConsonantUsingArrayList.countUsingArrayList("abcdefghijklmnopqrstuvwxyz");
    }
}
