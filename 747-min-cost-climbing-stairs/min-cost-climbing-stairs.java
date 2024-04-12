class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n == 2) return Math.min(cost[0], cost[1]);
        int[] dp = new int[n];

        dp[n - 1] = cost[n - 1];
        dp[n - 2] = Math.min(cost[n - 2], dp[n - 1] + cost[n - 2]);

        int i = n - 3;
        while (i >= 0) {
            dp[i] = Math.min(dp[i + 1], dp[i + 2]);
            dp[i] += cost[i];
            i--;
        }

        return Math.min(dp[0], dp[1]);


    }
}