class Solution {
    public void sortColors(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        int temp;
        while (mid <= high) {
            if (arr[mid] == 0) {
                temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }

        }

    }
}