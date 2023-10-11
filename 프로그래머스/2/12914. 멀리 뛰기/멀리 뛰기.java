class Solution {
    public long solution(int n) {
        long answer = 0;
        long dp[] = new long[n+1];
        if (n == 1){
            return 1;
        }
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        //dp[3]=3;
        //dp[4]=5;
        //dp[5]=8;
        //dp[6]=13;
        for(int i=3; i<n+1; i++){
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;

        }
        answer = dp[n];
        return answer;
    }
}