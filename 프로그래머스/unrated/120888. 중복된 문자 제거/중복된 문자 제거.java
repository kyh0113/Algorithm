import java.util.*;
class Solution {
    public String solution(String my_string) {
       String answer ="";
        List<String>list = new ArrayList<>();
        for(int i =0; i<my_string.length(); i++){
            if(list.contains(String.valueOf(my_string.charAt(i)))){
                continue;
            }
            list.add(String.valueOf(my_string.charAt(i)));
        }
        for(int i =0; i<list.size(); i++){
            answer+=list.get(i);
        }
        return answer;
    }
}