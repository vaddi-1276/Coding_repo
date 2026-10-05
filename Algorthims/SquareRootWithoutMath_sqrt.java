package Algorthims;

public class SquareRootWithoutMath_sqrt {
    public static int SquareRootWithoutMath_sqrtMethods(int number) {

        for (int i = 1; i <= number; i++) {
            if (i * i == number) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(SquareRootWithoutMath_sqrtMethods(11));
    }
}
