public class trappedwater {
    
    public static int TrappedWater(int height[]) {
        int n = height.length;
      /*  if (n <= 2) {
            return 0; // Cannot trap water with less than 3 bars
        } */

        int[] leftMax = new int[n];
        leftMax[0] = height[0];

        // Calculate left max heights
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];

        // Calculate right max heights
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        int trappedWater = 0;

        // Calculate trapped water for each bar
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String args[]) {
        int height[] = {6,2,1,0,4,8,2};
        int result = TrappedWater(height);
        System.out.println("Trapped Water: " + result);
    }
}
