import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String s[] = my_string.split(" "); // [7, -, 5, +, 10]
        answer = Integer.parseInt(s[0]);
        for(int i =0; i<s.length; i++){
            if(s[i].equals("+")){
                answer+=Integer.parseInt(s[i+1]);
            }else if(s[i].equals("-")){
                answer-=Integer.parseInt(s[i+1]);
            }
        }
        return answer;
    }
}