import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String arr[] = s.split(" ");
        List<String>list=new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("Z")){
                list.remove(arr[i-1]);
                continue;
            }
            list.add(arr[i]);
        }
        for(int i =0; i<list.size(); i++){
            answer+= Integer.parseInt(list.get(i));
        }
        return answer;
    }
}