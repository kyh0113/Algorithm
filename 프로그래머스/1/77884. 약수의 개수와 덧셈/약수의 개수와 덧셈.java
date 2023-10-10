class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i =left; i<=right; i++){ // 13
            int count=0;
            for(int j =1; j<=i; j++){
                if(i%j==0){
                    count++; //1 2
                }
            }
            if(count%2==0){
                answer+=i;
            }else{
                answer-=i;
            }
        }
        return answer;
    }
}