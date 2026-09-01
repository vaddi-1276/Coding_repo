package Strings;

import java.util.ArrayList;

// Input:
// Java Selenium Automation Testing

// Output:
// 4

class WordCountUsingSplit {
    public static void countUsingSplit(String str) {
        String words[] = str.split(" ");
        System.out.println(words.length);
    }
}

class WordCountUsingLoop {
    public static void countUsingLoop(String str) {
        int count = 0;
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            count++;
        }
        System.out.println(count);
    }
}

class WordCountUsingArrayList {
    public static void countUsingArrayList(String str) {
        ArrayList<String> list = new ArrayList<>();
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }

        int count=0;
        for(int i=0;i<list.size();i++)
        {
            count++;
        }
        System.out.println(count);
    }
}

public class WordCounter {
    public static void main(String[] args) {
        WordCountUsingSplit.countUsingSplit("Java Selenium Automation Testing");
        WordCountUsingLoop.countUsingLoop("Java Selenium Automation Testing Learning");
        WordCountUsingArrayList.countUsingArrayList("Selenium Automation Learning Pratcing Programming Programs");
    }
}
