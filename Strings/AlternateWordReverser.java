package Strings;

import java.util.ArrayList;
// Input:
// Java Selenium Testing Automation

// Output:
// avaJ Selenium gnitseT Automation

class AlternateWordReversalUsingLoop {

    public static void reverseUsingLoop(String str) {
        
        String words[]=str.split(" ");
        String finalresult="";
        for(int i=0;i<words.length;i++)
        {
            if(i%2==0)
            {
                for(int j=words[i].length()-1;j>=0;j--)
                {
                    finalresult=finalresult+words[i].charAt(j);
                }
            }
            else
            {
                finalresult=finalresult+words[i];
            }
             finalresult=finalresult+" ";
        }
        System.out.print(finalresult);
        System.out.println();
    }
}

class AlternateWordReversalUsingStringBuilder {
    public static void reverseUsingStringBuilder(String str) {
        StringBuilder result = new StringBuilder();
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                for (int j = words[i].length() - 1; j >= 0; j--) {
                    result.append(words[i].charAt(j));
                }
            } else {
                result.append(words[i]);
            }
            result.append(" ");
        }
        System.out.println(result);
    }
}

class AlternateWordReversalUsingArrayList {
    public static void reverseUsingArrayList(String str) {

        ArrayList<String>list=new ArrayList<>();
        StringBuilder result=new StringBuilder();
        String words[]=str.split(" ");
        for(int i=0;i<words.length;i++)
        {
            list.add(words[i]);
        }

        for(int i=0;i<list.size();i++)
        {
            if(i%2==0)
            {
                for(int j=list.get(i).length()-1;j>=0;j--)
                {
                    result.append(words[i].charAt(j));
                }
            }
            else{
                result.append(words[i]);
            }
            result.append(" ");
        }
        System.out.println(result);
    }
}


public class AlternateWordReverser {
    public static void main(String[] args) {
        AlternateWordReversalUsingLoop.reverseUsingLoop("Java Selenium Testing Automation");
        // AlternateWordReversalUsingStringBuilder.reverseUsingStringBuilder("Python Selenium Testing Automation");
        // AlternateWordReversalUsingArrayList.reverseUsingArrayList("Javascript Selenium Testing Automation");
    }
}
