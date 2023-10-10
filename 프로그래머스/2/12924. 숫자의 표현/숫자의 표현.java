class Solution {
    public int solution(int n) { // 투포인터로 풀이함 기본공식임
        int answer = 0;
        int left = 1, right = 1;
        int sum = 0;

        while(left<=n){
            if(sum<n){
                sum+=right++; 
            }else{
                sum-=left++; 
            }
            if(sum==n){
                answer++;
            }
        }
        // System.out.println(answer);
        return answer;
    }
}
    