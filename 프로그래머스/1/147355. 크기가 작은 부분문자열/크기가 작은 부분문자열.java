import java.util.*;
class Solution {
    public int solution(String t, String p) { //3141592  271
        int answer = 0;
        int index = 0;
        int plen = p.length();
        List<Long>list = new ArrayList<>();
        for(int i =0; i<t.length()-plen+1; i++) {
            String s = "";
            s = t.substring(index, (index+plen));
            list.add(Long.parseLong(s));
            index++;
        }
        long P = Long.parseLong(p);
        for(int i =0; i<list.size(); i++){
            if(list.get(i)<=P){
                answer++;
            }
        }
        return answer;
    }
}