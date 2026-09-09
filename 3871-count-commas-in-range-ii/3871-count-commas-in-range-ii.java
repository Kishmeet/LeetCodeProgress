class Solution {
    public long countCommas(long n) {
        long ans = 0;

        if (n >= 1_000)
            ans += 1 * (Math.min(n, 999_999L) - 999);

        if (n >= 1_000_000)
            ans += 2 * (Math.min(n, 999_999_999L) - 999_999);

        if (n >= 1_000_000_000L)
            ans += 3 * (Math.min(n, 999_999_999_999L) - 999_999_999);

        if (n >= 1_000_000_000_000L)
            ans += 4 * (Math.min(n, 999_999_999_999_999L) - 999_999_999_999L);

        if (n >= 1_000_000_000_000_000L)
            ans += 5 * (n - 999_999_999_999_999L);

        return ans;
    }
}