class Solution{
    public int solution(int n, int a, int b){
        int answer = 0;
        while(a!=b){
            answer++;
            // 2로 나누는 이유는 2명씩 경기하니깐
            // 1을 더하는 이유는 홀수든 짝수든 몫에 무리 없도록
            a = (a+1)/2; // 본인 차례까지 2개의 조가 경기
            b = (b+1)/2; // 본인 차례까지 4개의 조가 경기
        }
        return answer;
    }
}