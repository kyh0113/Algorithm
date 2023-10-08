import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        List<Character>list = new ArrayList<>();
        for(int i =0; i<my_string.length(); i++){
            if(48<=my_string.charAt(i) && 57>=my_string.charAt(i)){ // 숫자
                list.add(my_string.charAt(i));
            }
        }
        int answer[] = new int [list.size()];
        for(int i =0; i<list.size(); i++){
            answer[i]=Integer.valueOf(String.valueOf(list.get(i)));
        }
        Arrays.sort(answer);
        return answer;
    }
}