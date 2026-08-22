package Strings;

// Input:
// ABCD
// CDAB

// Output:
// Cyclic Rotation = Yes

class UsingStr1andStr1andContainsCyclicRotationCheck {
    public static void UsingStr1andStr1andContainsCyclicRotationCheckMethods(String str1, String str2) {

        String temp = str1 + str1;
        if (temp.contains(str2)) {
            System.out.println("Cyclic Rotation = Yes");
        } else {
            System.out.println("Cyclic Rotation = No");
        }
    }
}

class UsingStr1Str1indexOfCyclicRotationCheck {
    public static void UsingStr1Str1indexOfCyclicRotationCheckMethods(String str1, String str2) {

        String temp = str1 + str1;

        if (temp.indexOf(str2) != -1) {
            System.out.println("Cyclic Rotation = Yes");
        } else {
            System.out.println("Cyclic Rotation = No");
        }
    }
}

public class CyclicRotationCheck {
    public static void main(String[] args) {
        UsingStr1andStr1andContainsCyclicRotationCheck.UsingStr1andStr1andContainsCyclicRotationCheckMethods("ABCD",
                "CDAB");
        UsingStr1Str1indexOfCyclicRotationCheck.UsingStr1Str1indexOfCyclicRotationCheckMethods("ABCD", "CDAB");
    }
}
