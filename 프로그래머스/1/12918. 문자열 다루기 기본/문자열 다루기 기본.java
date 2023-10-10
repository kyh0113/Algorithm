class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        String[]arr={};
        if(s.length()==4 || s.length()==6){
            for(int i =0; i<s.length(); i++){
                arr = s.replaceAll("[a-zA-Z]", "").split("");
            }
            if(arr.length==s.length()) {
                answer = true;
            }else{
                answer=false;
            }
        }else{
            answer=false;
        }
        return answer;
    }
}