public class FindMax {
    public static int maxSubArray(int[] nums) {
        int[] currentSub = new int[nums.length];
        currentSub[0] = nums[0];
        int max = currentSub[0];

        for (int i = 1; i < nums.length; i++) {
            currentSub[i] = nums[i] + (Math.max(currentSub[i - 1], 0));
            max = Math.max(max, currentSub[i]);
        }

        return max;
    }
}