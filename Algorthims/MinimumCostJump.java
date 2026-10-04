package Algorthims;

// cost=[10,15,20,5]
// 30
public class MinimumCostJump {

public static int calculateCost(int[] cost) {

    int total = 0;

    for (int i = 0; i < cost.length; i++) {

        if (i == 0 || i == 1 || i == cost.length - 1) {
            total = total + cost[i];
        }
    }

    return total;
}

    public static void main(String[] args) {
        System.out.println(
            calculateCost(new int[]{10, 15, 20, 5})
        );
    }
}
