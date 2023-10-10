class Solution {
    public int solution(int n) {
        int answer = 0;

        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i =2; i<=n; i++){
            dp[i] =(dp[i-2]+dp[i-1])%1234567; //%1234567한 값이 dp[i]에 계속적으로 저장되어야함 문제 설명이 그래
        }
        answer = dp[n];
        return answer;
    }
}