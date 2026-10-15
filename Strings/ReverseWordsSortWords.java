package Strings;

import java.util.ArrayList;

// Input:
// Java Selenium Testing

// Output:
// gnitseT muineleS avaJ

class UsingNestedForLoopReverseWordsSortWords {

    public static void UsingNestedForLoopReverseWordsSortWordsMethods(String str) {

        String resultString="";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);

            if(ch==' ')
            {
                resultString=resultString+" ";
            }
            else 
            {
                resultString=resultString+ch;
            }
        }
        System.out.println(resultString);
    }
}

class UsingArrayListCollectionsReverseSortWords {
    public static void UsingArrayListCollectionsReverseSortWordsMethods(String str) {

        String words[] = str.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }

        ArrayList<String> reverseStringlist = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reverseStringlist.add(list.get(i));
        }
        System.out.println(reverseStringlist);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < reverseStringlist.size(); i++) {
            result.append(new StringBuilder(reverseStringlist.get(i)).reverse());
            result.append(" ");
        }
        System.out.println(result);

    }
}

public class ReverseWordsSortWords {
    public static void main(String[] args) {
       UsingNestedForLoopReverseWordsSortWords.UsingNestedForLoopReverseWordsSortWordsMethods("Java Selenium Testing");
        // UsingArrayListCollectionsReverseSortWords
        // .UsingArrayListCollectionsReverseSortWordsMethods("Java Selenium Testing");
    }
}
