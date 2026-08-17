package Strings;

import java.util.ArrayList;

// Input:
// programming

// Output:
// progamin

class DuplicateRemovalUsingNestedLoop {
    public static void removeUsingNestedLoop(String str) {
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

            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}

class DuplicateRemovalUsingArrayList {
    public static void removeUsingArrayList(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        for (int i = 0; i < list.size(); i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (list.get(i) == list.get(j)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}

class for_loop_class {
    public static void for_loop_methods(String str) {
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
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}

public class DuplicateCharacterRemover {
    public static void main(String[] args) {
        DuplicateRemovalUsingNestedLoop.removeUsingNestedLoop("programming");
        DuplicateRemovalUsingArrayList.removeUsingArrayList("programming");
        for_loop_class.for_loop_methods("programming");
    }
}
