class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2==0){ // 길이가 짝수면
            int mid1 = (s.length()/2)-1;
            int mid2 = mid1+1;
            answer = String.valueOf(s.charAt(mid1))+String.valueOf(s.charAt(mid2));
        }else{ // 길이가 홀수면
            int mid = s.length()/2;
            answer = String.valueOf(s.charAt(mid));
        }
        return answer;
    }
}