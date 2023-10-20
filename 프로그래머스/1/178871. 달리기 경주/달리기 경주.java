import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
                //  HashMap의 키는 유일해야 하지만 value값은 같을 수 있음
        Map<String,Integer> map = new HashMap<>();
        for(int i =0; i< players.length; i++){
            map.put(players[i], i);
        }
        
        for(int i =0; i< callings.length; i++){
            int rank = map.get(callings[i]);
            if(rank==0){ // 어차피 1등이면
                continue; // 걍 넘어가
            }else{
                String temp = players[rank]; // kai
                map.put(temp, rank-1); // kai=2가 됨 (수정이 되는거임)
                players[rank] = players[rank-1]; // kai자리에 poe가 갘
                map.put(players[rank], rank);
                players[rank-1] = temp;
            }
        }
        return players;
    }
}