package Chapter13;
import java.util.*;

public class trappedWater {

    public static int trappedWater1(int height[]) {
        int n = height.length;
        int leftmax[] = new int[n];
        int rightMax[] = new int[n];

        // Calculate left max boundary
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // Calculate right max boundary
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Calculate trapped water
        int trappedwaterV = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightMax[i]);
            trappedwaterV += waterlevel - height[i];
        }

        return trappedwaterV;
    }

    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedWater1(height));
    }
}
