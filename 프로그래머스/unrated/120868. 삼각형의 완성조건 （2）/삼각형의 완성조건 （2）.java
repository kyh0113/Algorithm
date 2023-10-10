class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0],sides[1]);
        int min = Math.min((sides[0]),sides[1]);
        for(int i = 1; i<=max; i++){
            if(max<min+i){ // 가장 긴 변의 길이는 다른 두 변의 합 보다 작아야 한다.
                answer++;
            }
        }
        answer+=(min+max) - (max+1); // 두 길이 더한거 보다는 작고 sides에 있는 값 보단 커야함
        return answer;
    }
}