package Strings;

import java.util.ArrayList;

// Input:
// aaabbcdddd

// Output:
// a3b2c1d4

class UsingForLoopCompressString {
    public static void UsingForLoopCompressStringMethods(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }
            int count = 1;
            for (int k = i + 1; k < str.length(); k++) {
                if (str.charAt(k) == str.charAt(i)) {
                    count++;
                }
            }
            result = result + str.charAt(i) + count;
        }
        System.out.println(result);
    }
}

class UsingArrayListCompressString
{
    public static void UsingArrayListCompressStringMethods(String str) {
        
        ArrayList<Character>list=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            list.add(str.charAt(i));
        }
        StringBuilder result=new StringBuilder();
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

            result.append(list.get(i));
            result.append(count);
        }
        System.out.println(result);
    }
}
public class CompressString {
    public static void main(String[] args) {
        UsingForLoopCompressString.UsingForLoopCompressStringMethods("aaabbcdddd");
        UsingArrayListCompressString.UsingArrayListCompressStringMethods("aaabbbcccddd");
    }
}
