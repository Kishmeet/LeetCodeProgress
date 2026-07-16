class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = piles[0];
        for (int i = 1; i < piles.length; i++) {
            high = Math.max(high, piles[i]);
        }
        int low = 0; 
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int time = eatingTime(piles, mid);
            if (time <= h)
            {
                high = mid - 1;
               
            }
            else
                low = mid + 1;
        }
        return low;
    }

    int eatingTime(int[] arr, double n) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += Math.ceil(arr[i] / n);
        }
        return total;
    }
}