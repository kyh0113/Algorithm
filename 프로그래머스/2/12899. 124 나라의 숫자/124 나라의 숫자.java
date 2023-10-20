class Solution {
    public String solution(int n) {
        String answer = "";
        String arr[] = {"1","2","4"};
        while(n>0){ 
            n--; 
            answer = arr[n%3]+answer; 
            n/=3; // n<=0이 되야 끝남
        }
        // System.out.println(answer);
        return answer;
    }
}