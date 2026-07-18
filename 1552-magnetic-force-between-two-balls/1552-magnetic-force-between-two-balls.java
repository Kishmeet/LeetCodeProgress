class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1, high = (position[position.length - 1] - position[0])/(m-1);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canPlace(position, mid, m)) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return high;
    }

    boolean canPlace(int[] position, int place, int m) {
        int count = 1;
        int last = position[0];
        for (int i = 1; i < position.length; i++) {
            if (position[i] - last >= place) {
                last = position[i];
                count++;
            }
            if (count >= m)
                return true;
        }

        return false;
    }
}