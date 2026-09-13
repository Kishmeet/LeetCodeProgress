class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = findMax(mat, m, mid);
            int left = mid - 1 >= 0 ? mat[row][mid - 1] : -1;
            int right = mid + 1 < n ? mat[row][mid + 1] : -1;
            if (mat[row][mid] > left && mat[row][mid] > right)
                return new int[] { row, mid };
            else if (mat[row][mid] < left)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return new int[] { -1, -1 };
    }

    public int findMax(int[][] mat,int n,int col)
    {
        int max=-1,ind=-1;
        for(int i=0;i<n;i++)
        {
            if(mat[i][col]>max)
            {
                max=mat[i][col];
                ind=i;
            }
        }
        return ind;
    }
}