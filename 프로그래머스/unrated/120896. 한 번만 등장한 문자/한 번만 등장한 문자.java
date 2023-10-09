import java.util.*; 
class Solution {
    public String solution(String s) {
        // 최빈값 문제처럼 풀어보기
        String answer = "";
        int[] alpabet = new int[26];
        for(int i =0; i<s.length(); i++){
            alpabet[s.charAt(i)-97]++;
        }
        System.out.println(Arrays.toString(alpabet));
        for(int i=0; i<alpabet.length; i++){
            if(alpabet[i]==1){
                answer+=String.valueOf((char) (i+97));
            }
        }
        return answer;
    }
}