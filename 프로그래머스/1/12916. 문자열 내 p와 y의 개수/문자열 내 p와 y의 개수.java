class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int p =0;
        int y =0;
        for(int i =0; i<s.length(); i++) {
            if(String.valueOf(s.charAt(i)).contains("p")){
                p++;
            }else if(String.valueOf(s.charAt(i)).contains("y")){
                y++;
            }
        }
        if(p!=y){
            answer=false;
        }
        return answer;
    }
}