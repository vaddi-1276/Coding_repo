package Strings;

import java.util.ArrayList;

// Input:
// programming

// Output:
// r

class FirstRepeatedUsingNestedLoop
{
    public static void findUsingNestedLoop(String str) {
        
        for(int i=0;i<str.length();i++)
        {
            boolean found=false;
            for(int j=0;j<i;j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    found=true;
                    break;
                }
            }
            if(found)
            {
                continue;
            }
            int count=1;
            for(int k=i+1;k<str.length();k++)
            {
                if(str.charAt(k)==str.charAt(i))
                {
                    count++;
                }
            }
            if(count>1)
            {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}

class FirstRepeatedUsingArrayList
{
    public static void findUsingArrayList(String str) {
        
        ArrayList<Character>list=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            list.add(str.charAt(i));
        }

        for(int i=0;i<list.size();i++)
        {
            boolean found=false;
            for(int j=0;j<i;j++)
            {
                if(list.get(i)==list.get(j))
                {
                    found=true;
                    break;
                }
            }
            if(found)
            {
                continue;
            }
            int count=1;
            for(int k=i+1;k<list.size();k++)
            {
                if(list.get(k)==list.get(i))
                {
                    count++;
                }
            }

            if(count>1)
            {
                System.out.println(list.get(i));
                break;
            }
        }
    }
}

public class FirstRepeatedCharacterFinder {
    public static void main(String[] args) {
        FirstRepeatedUsingNestedLoop.findUsingNestedLoop("programming");
        FirstRepeatedUsingArrayList.findUsingArrayList("programming");
    }
}
