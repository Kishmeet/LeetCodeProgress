class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int high = 0, low = 0;
        for (int cap : weights) {
            low = Math.max(low, cap);
            high += cap;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possibleDays(weights, mid, days))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }

    boolean possibleDays(int weights[], int cap, int days) {
        int load = 0, req = 1;
        for (int w : weights) {
            if (load + w > cap) {
                req++;
                load = w;
            } else
                load += w;
        }

        return req <= days;
    }
}