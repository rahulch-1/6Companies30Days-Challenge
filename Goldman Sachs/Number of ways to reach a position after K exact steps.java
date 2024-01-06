import java.util.*;

class Solution {
    public int numberOfWays(int start, int end, int k) {
        int[][] dp = new int[2*(start+k)][k+1];                      
		for (int[] a : dp){
            Arrays.fill(a, -1);
        }
		int maxDistance = Math.abs(start-k);           
        return ways(start+maxDistance, end+maxDistance, k, dp);
    }
	
    int mod = 1000_000_007;
    int ways(int s, int e, int k, int[][] dp) {
		if(k==0) {                                             
		    if(s==e){
                return 1;
            }                               
			else{
                return 0;
            }                                      
		}
		
		if(dp[s][k] != -1) {
            return dp[s][k];
        }
		
		int left = ways(s-1, e, k-1, dp);
		int right = ways(s+1, e, k-1, dp);
		
		return dp[s][k] = (left + right)%mod;
	}
}