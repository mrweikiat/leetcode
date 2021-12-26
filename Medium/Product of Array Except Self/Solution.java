// Runtime: 1 ms, faster than 100.00% of Java online submissions for Product of Array Except Self.
// Memory Usage: 49 MB, less than 95.29% of Java online submissions for Product of Array Except Self.
// 12/26/2021 21:53	Accepted	1 ms	49 MB	java
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] prefix = new int[nums.length];
        int [] suffix = new int[nums.length];

        prefix[0] = 1; // prefix of 1st element is nothing, hence 1
        suffix[nums.length-1] = 1; // suffix of last element is nothing, hence 1

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        for (int i = nums.length-2; i >= 0; i--) {
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        // once we have the arr of the product of number before and after
        // we can just multiply them to get the answer except the nums[i]

        for (int i = 0; i < nums.length; i++) {
            nums[i] = prefix[i] * suffix[i];
        }

        return nums;

    }
}