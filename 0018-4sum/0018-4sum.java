class Solution {
     public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length == 4) {
            long sum = nums[0];
            sum += nums[1];
            sum += nums[2];
            sum += nums[3];
            if (sum == target) {
                ans.add(Arrays.asList(nums[0], nums[1], nums[2], nums[3]));
            }
            return ans;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < nums.length - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                int k = j + 1;
                int l = nums.length - 1;
                while (k < l) {

                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];

                    if (sum < target)
                        k++;
                    else if (sum > target)
                        l--;
                    else {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        while (k < l && nums[k] == nums[k - 1])
                            k++;
                    }

                }
            }
        }

        return ans;
    }
}