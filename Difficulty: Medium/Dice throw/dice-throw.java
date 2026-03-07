class Solution {
    static long noOfWays(int m, int n, int x) {
        
        long[] dp = new long[x + 1];
        dp[0] = 1; // base case
        
        for (int dice = 1; dice <= n; dice++) {
            
            long[] next = new long[x + 1];
            
            for (int sum = 1; sum <= x; sum++) {
                
                for (int face = 1; face <= m; face++) {
                    
                    if (sum - face >= 0) {
                        next[sum] += dp[sum - face];
                    }
                    
                }
            }
            
            dp = next;
        }
        
        return dp[x];
    }
}