class Solution {
    public String solution(String cipher, int code) {
        String answer ="";
        for(int i =0; i<=cipher.length(); i++){
            if(i==0){
                continue;
            }
            if(i%code==0){
                answer+=String.valueOf(cipher.charAt(i-1));
            }   
        }
        return answer;
    }
}