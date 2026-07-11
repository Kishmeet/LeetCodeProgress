class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int pr = 1;
        for (int i = 0; i < nums.length; i++) {
            pr *= nums[i];
            max = Math.max(pr, max);
            if (pr == 0) {
                pr = 1;
            }
        }
        pr=1;
        for (int i = nums.length - 1; i >= 0; i--) {
            pr *= nums[i];
            max = Math.max(pr, max);
            if (pr == 0) {
                pr = 1;
            }
        }
        return max;
    }
}