package Strings;

import java.util.ArrayList;

// Input:
// Java Selenium Testing

// Output:
// avaJ muineleS gnitseT

class ReverseWordsUsingNestedLoop {
    public static void reverseUsingNestedLoop(String str) {

        String words[] = str.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                result = result + words[i].charAt(j);
            }
            result = result + " ";
        }
        System.out.println(result);
    }

}

class ReverseWordsUsingStringBuilder {
    public static void reverseUsingStringBuilder(String str) {
        String result = "";
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            result = result + new StringBuilder(words[i]).reverse();
            result = result + " ";
        }
        System.out.println(result);
    }
}

class ReverseWordsUsingArrayList {
    public static void reverseUsingArrayList(String str) {

        ArrayList<String> list = new ArrayList<>();
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }
        System.out.println(list);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            result.append(new StringBuilder(list.get(i)).reverse());
            result.append(" ");
        }
        System.out.println(result);
    }
}

public class ReverseEveryWord {
    public static void main(String[] args) {
        ReverseWordsUsingNestedLoop.reverseUsingNestedLoop("Java Selenium Testing");
        ReverseWordsUsingStringBuilder.reverseUsingStringBuilder("Python Java");
        ReverseWordsUsingArrayList.reverseUsingArrayList("Selenium Testing");
    }
}
