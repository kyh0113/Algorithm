class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String a = String.valueOf(num);
        for(int i =0; i<a.length(); i++){
            if(Integer.parseInt(String.valueOf(a.charAt(i)))==k){
                answer=i+1;
                break;
            }
        }
        if(answer==0){
            answer = -1;
        }
        return answer;
    }
}