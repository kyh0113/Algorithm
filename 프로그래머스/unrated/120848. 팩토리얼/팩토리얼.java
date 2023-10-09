class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 1;
        int count=0;
        for(int i =1; i<n+1; i++) {
            sum=sum*i; // 1, 2, 6, 24
            count++;
            if(sum==n){
                answer = count;
                break;
            }
            else if(sum>n){
                answer=count-1;
                break;
            }
        }
        // System.out.println(answer);
        return answer;
    }
}