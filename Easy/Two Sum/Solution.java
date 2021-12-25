class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];
        boolean isFound = false;

        for (int i = 0; i < nums.length; i++) {
            if (isFound) {
                break;
            }

            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    // hit the ans
                    ans[0] = i;
                    ans[1] = j;
                    isFound = true;
                    break;
                }
            }

        }

        return  ans;

    }
}