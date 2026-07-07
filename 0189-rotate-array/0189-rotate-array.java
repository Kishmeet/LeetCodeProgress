class Solution {
    static void reverse(int a[], int start, int end) {
    int temp;
    while (start <= end) {

        temp = a[start];
        a[start] = a[end];
        a[end] = temp;
        start++;
        end--;

    }

}
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k=k%n;
        reverse(arr, n- k,n-1);
        reverse(arr, 0, n -k- 1);
        reverse(arr, 0, n - 1);
        
    }
}