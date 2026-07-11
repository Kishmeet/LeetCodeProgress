class Solution {
      public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int []> ans = new ArrayList<>();
        for (int interval[] : intervals) {
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < interval[0]) {
                ans.add(new int[] {interval[0], interval[1]});
                // ans.add(interval);

            } else {
                int last = ans.size() - 1;
                int maxEnd = Math.max(
                        ans.get(last)[1],
                        interval[1]);
                ans.get(last)[1]= maxEnd;
            }
        }
        return ans.toArray(new int [ans.size()][]);
    }
}