class Solution {
    public int longestConsecutive(int[] nums) {
        int l = 1;
        int n = nums.length;
        if (n == 0)
            return 0;
        HashSet<Integer> s = new HashSet<>();
        for (int i : nums) {
            s.add(i);

        }
        int c = 0;
        for (Integer i : s) {

            if (!s.contains(i - 1)) {
                c = 1;
                int x = i;
                while (s.contains(x + 1)) {
                    x = x + 1;
                    c++;
                }
            l = Math.max(l, c);
            }
        }

        return l;

    }
}