package Algorthims;

public class MaximumScoreJump {

    public static void main(String[] args) {

        int[] arr = { 10, 20, 5, 30, 15 };

        int maxScore = arr[0];

        for (int i = 0; i < arr.length; i++) {

            int currentScore = arr[0];

            for (int j = 1; j <= i; j++) {

                if (arr[j] > arr[j - 1]) {
                    currentScore = currentScore + arr[j];
                }
            }

            maxScore = Math.max(maxScore, currentScore);

            // i=0 without entering j for loop why because 1<=0 is not so entering. maxscore=(10,10) =>10.
            // i=1 j loop 1<=1
            // 20>10
            //currentscore=10+20 =>,axscore(10,30)=>30
            //i=2 j loop 1<=2  
            // j =1 10+20=30 not entering j=2 why because 5>=20 is not max score =30

            //i=3 j loop 1<=3
            //j=1 10+20=30,30+30=40 maxscore =60

        }

        System.out.println(maxScore);
    }
}