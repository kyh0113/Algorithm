class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i =1; i<=n; i++){
            if(sosu(i)==true){
                answer++;
            }
        }
        return answer;
    }
    public static boolean sosu(int i){
        if(i==1){
            return false;
        }for(int j = 2; j<=Math.sqrt(i); j++){
            if(i%j==0){
                return false;
            }
        }
        return true; // 나눠지는 숫자가 없어야 소수임
    }
}