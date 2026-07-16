class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length)
            return -1;
        int low = bloomDay[0], high = bloomDay[0];
        for (int i = 0; i < bloomDay.length; i++) {
            low = Math.min(low, bloomDay[i]);
            high = Math.max(high, bloomDay[i]);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(bloomDay, mid, m, k))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }

    boolean possible(int[] nums, int day, int m, int k) {
        int counter = 0;
        int bouquets = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= day)
                counter++;
            else {
                bouquets += counter / k;
                counter = 0;
            }
        }
        bouquets += counter / k;
        return bouquets >= m;

    }
}