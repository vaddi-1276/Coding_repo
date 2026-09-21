package Strings;

// Input: level
// Output: Yes

class UsingForLoopCheckStringStartsandEndsWithSameCharacter {
    public static void UsingForLoopCheckStringStartsandEndsWithSameCharacterMethods(String str) {

        char firstchar = str.charAt(0);
        char lastchar = str.charAt(str.length() - 1);

        if (firstchar == lastchar) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

class UsingstartswithandendswithCheckStringStartsandEndsWithSameCharacter {
    public static void UsingstartswithandendswithCheckStringStartsandEndsWithSameCharacterMethods(String str) {

        String firstchar = String.valueOf(str.charAt(0));
        String lastchar = String.valueOf(str.charAt(str.length() - 1));

        if (str.startsWith(firstchar) && str.endsWith(lastchar) && firstchar.equals(lastchar)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

public class CheckStringStartsandEndsWithSameCharacter {
    public static void main(String[] args) {
        UsingForLoopCheckStringStartsandEndsWithSameCharacter
                .UsingForLoopCheckStringStartsandEndsWithSameCharacterMethods("abc");
        UsingstartswithandendswithCheckStringStartsandEndsWithSameCharacter
                .UsingstartswithandendswithCheckStringStartsandEndsWithSameCharacterMethods("level");
       
    }
}
