class Solution {
    public int findGCD(int[] nums){
        int min = nums[0], max = nums[0];
        for (int i : nums){
            if (i< min)
                min = i;
            if (i > max)
                max = i;
        }
        while(min!=0)
        {
            int r=max%min;
            max=min;
            min=r;
        }
        return max;
    }
}