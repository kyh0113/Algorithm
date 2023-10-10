class Solution {
    public String solution(String s, int n) {
        String answer ="";
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c==' '){
                answer+=" ";
            }if(65<=c && c<=90){ // 대문자
                if(c+n>90){
                    answer+=Character.toString(c-26+n);
                }else{
                    answer+=Character.toString(c+n);
                }
            }if(97<=c && c<=122){ // 소문자
                if(c+n>122){
                    answer+=Character.toString(c-26+n);
                }else{
                    answer+=Character.toString(c+n);
                }
            }
        }
        return answer;
    }
}