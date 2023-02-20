public class FindMax {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] currentsSub = new int[n];
        currentsSub[0] = nums[0];
        int max = currentsSub[0];

        for (int i = 1; i < n; i++) {
            currentsSub[i] = nums[i] + (Math.max(currentsSub[i - 1], 0));
            max = Math.max(max, currentsSub[i]);
        }

        return max;
    }
}