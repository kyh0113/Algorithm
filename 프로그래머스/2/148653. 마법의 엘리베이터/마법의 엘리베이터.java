import java.util.*;
class Solution {
    public int solution(int storey) {
        int answer = 0;

        int floor = 10;

        while (storey > 0) {
            int mod = storey % floor;
            if (mod < 5) {
                answer += mod;
                storey = storey / floor;
            }
            else if(mod==5){
                int next = storey/floor;
                if(next % floor>=5){ // 175계산할 때 이런식
                    answer+=floor - mod;
                    storey = storey / floor +1;
                }else{
                    answer+=mod;
                    storey = storey/floor;
                }
            }
            else if(mod>5){
                answer += floor-mod;
                storey = storey/floor+1;
            }
        }
        // System.out.println(answer);
        return answer;
    }
}