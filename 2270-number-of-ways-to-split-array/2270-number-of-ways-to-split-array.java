class Solution {
    public int waysToSplitArray(int[] nums) {
        long leftsum = 0, rightsum = 0;
        int count = 0;
        for (int i : nums)
            rightsum += i;
        for (int i=0;i<nums.length-1;i++) {
            leftsum += nums[i];
            rightsum -= nums[i];
            if (leftsum >= rightsum)
                count++;
        }
        return count;
    }
}