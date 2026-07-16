class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int prefixGcd[] = new int[n];
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
            prefixGcd[i] = gcd(nums[i], maxi);
        }
        Arrays.sort(prefixGcd);
        int l = 0, h = n - 1;
        long total = 0;
        while (l < h) {
            total += gcd(prefixGcd[l], prefixGcd[h]);
            l++;
            h--;
        }
        return total;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}