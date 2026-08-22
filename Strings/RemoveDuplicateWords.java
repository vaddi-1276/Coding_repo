package Strings;

import java.util.ArrayList;

// Input:
// Java Selenium Java Testing Selenium

// Output:
// Java Selenium Testing

class UsingNestedForLoopRemoveDuplicateWords {

    public static void UsingNestedForLoopRemoveDuplicateWordsMethods(String str) {

        String words[] = str.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {

                if (words[i].equals(words[j])) {
                    found = true;
                    break;
                }
            }

            if (found) {
                continue;
            }

            result = result + words[i];
            result = result + " ";
        }
        System.out.println(result);
    }
}

class UsingArrayListRemoveDuplicateWords {
    public static void UsingArrayListRemoveDuplicateWordsMethods(String str) {

        ArrayList<String> list = new ArrayList<>();
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (list.get(i).equals(list.get(j))) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }

            result.append(list.get(i));
            result.append(" ");
        }
        System.out.println(result);
    }
}

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        UsingNestedForLoopRemoveDuplicateWords
                .UsingNestedForLoopRemoveDuplicateWordsMethods("Java Selenium Java Testing Selenium");
        UsingArrayListRemoveDuplicateWords
                .UsingArrayListRemoveDuplicateWordsMethods("Java Selenium Java Testing Selenium");
    }
}
