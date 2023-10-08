import java.util.*;
class Solution {
    public String solution(String rny_string) {
        String answer="";
        for(int i =0; i<rny_string.length(); i++){
            if(String.valueOf(rny_string.charAt(i)).equals("m")){
                answer+=(String.valueOf(rny_string.charAt(i)).replaceAll("m","rn"));
                continue;
            }
            answer+=String.valueOf(rny_string.charAt(i));
        }
        return answer;
    }
}