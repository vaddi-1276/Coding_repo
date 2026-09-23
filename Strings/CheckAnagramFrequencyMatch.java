package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Input:
// listen
// silent

// Output:
// Frequency Match = Yes
// Anagram = Yes

class UsingArraysSortCheckAnagramFrequencyMatch {
    public static void UsingArraysSortCheckAnagramFrequencyMatchMethods(String str1, String str2) {

        if(str1.length()!=str2.length())
        {
            System.out.println("Not Anagram");
            return;
        }

        char firstarr[]=str1.toCharArray();
        char secondarr[]=str2.toCharArray();

        Arrays.sort(firstarr);
        Arrays.sort(secondarr);

        for(int i=0;i<firstarr.length;i++)
        {
            if(firstarr[i]!=secondarr[i])
            {
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
        
    }
}

class UsingArrayListCheckAnagramFrequencyMatch {
    public static void UsingArrayListCheckAnagramFrequencyMatchMethods(String str1, String str2) {

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        for (int i = 0; i < str1.length(); i++) {
            list1.add(str1.charAt(i));
        }

        for (int i = 0; i < str2.length(); i++) {
            list2.add(str2.charAt(i));
        }
        Collections.sort(list1);
        Collections.sort(list2);

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Frequency Match = Yes");
        System.out.println("Anagram = Yes");
    }
}

public class CheckAnagramFrequencyMatch {
    public static void main(String[] args) {
        UsingArraysSortCheckAnagramFrequencyMatch.UsingArraysSortCheckAnagramFrequencyMatchMethods("listen",
                "silent");
        // UsingArrayListCheckAnagramFrequencyMatch.UsingArrayListCheckAnagramFrequencyMatchMethods("listen", "silent");
    }
}
