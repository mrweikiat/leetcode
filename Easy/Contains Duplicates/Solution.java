class Solution {
    public boolean containsDuplicate(int[] nums) {

        // 12/25/2021 14:37	Accepted	17 ms	50.9 MB	java

        HashSet<Integer> ds = new HashSet<>();
        boolean hasDuplicate = false;

        for (int element : nums) {
            ds.add(element);
        }

        for (int i = 0; i < nums.length; i++) {
            if (ds.contains(nums[i])) {
                while (ds.contains(nums[i])) {
                    // when we hit the first entry, we delete all occurrence of that elem
                    ds.remove(nums[i]);
                }
            } else {
                // means that there are duplicates since we deleted all occurrence upon first hit
                hasDuplicate = true;
                break;
            }
        }

        return hasDuplicate;

    }
}