class Solution {
    public int maxProfit(int[] prices) {

        // 12/26/2021 13:59	Accepted	1 ms	51.9 MB	java

        int ans = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > ans) {
                ans = prices[i] - minPrice;
            }
        }
        return ans;
    }
}