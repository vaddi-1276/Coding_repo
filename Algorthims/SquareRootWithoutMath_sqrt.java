package Algorthims;

public class SquareRootWithoutMath_sqrt {
    public static void main(String[] args) {
        int number = 100;

        for (int i = 1; i <= number; i++) {
            if (i * i == number) {
                System.out.println(i);
                break;
            }
        }
    }
}
