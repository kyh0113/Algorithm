import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer= new String[strings.length];
        Character[] temp = new Character[strings.length];
        // Arrays.sort(strings);
        for(int i =0; i< strings.length; i++){ // ["bed", "car", "sun"]
            String s = strings[i];
            s =  String.valueOf(s.charAt(n))+s;
            answer[i] = s;
        }
        Arrays.sort(answer);
        for(int i =0; i< answer.length; i++){
            answer[i] = answer[i].substring(1,answer[i].length());
            System.out.println(answer[i]);
        }
        return answer;
    }
}