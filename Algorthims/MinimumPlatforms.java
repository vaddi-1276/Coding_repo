package Algorthims;

import java.util.Arrays;

// Arrival=[900,940,950,1100,1500,1800]

// Departure=[910,1200,1120,1130,1900,2000]

// 3

public class MinimumPlatforms {
    public static int MinimumPlatformsMethods(int arrival[], int departure[]) {

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int maxPlatform = 0;
        int platform = 0;

        int j = 0;
        for (int i = 0; i < arrival.length;) {
            if (arrival[i] <= departure[j]) {
                platform++;

                if (platform > maxPlatform) {
                    maxPlatform = platform;
                }
                i++;
            }

            else {
                platform--;
                j++;
            }
        }
        return maxPlatform;
    }

    public static void main(String[] args) {
        System.out.println(MinimumPlatformsMethods(
            new int[] { 900, 940, 950, 1100, 1500, 1800 },
            new int[] { 910, 1200, 1120, 1130, 1900, 2000 }));
    }
}
