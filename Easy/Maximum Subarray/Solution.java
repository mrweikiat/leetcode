// Runtime: 1 ms, faster than 100.00% of Java online submissions for Maximum Subarray.
// Memory Usage: 48.9 MB, less than 91.73% of Java online submissions for Maximum Subarray.
// 12/26/2021 23:24	Accepted	1 ms	48.9 MB	java
class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += nums[i];
            max = Math.max(sum,max);

            // reset the head of subarr
            if(sum < 0) {
                sum = 0;
            }
        }

        return max;

    }
}
