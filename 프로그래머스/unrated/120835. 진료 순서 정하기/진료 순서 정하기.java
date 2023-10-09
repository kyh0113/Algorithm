import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        //결과가 answer[0]=3, answer[1]=1, answer[2]=2가 나와야함
        int[] answer = new int[emergency.length];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < emergency.length; i++) {
            map.put(emergency[i], i); // (3,0), (76,1), (24,2)
        }

        Arrays.sort(emergency); // 3, 24, 76
        for (int i = emergency.length-1; i >= 0; i--) { // i=2, i=1, i=0 // answer의 0번째가 1이어야 하는 것 부터~
            answer[map.get(emergency[i])] = emergency.length - i; // 1,2,3
        } // answer[1] = 1, answer[2] = 2, answer[0] = 3
        // 우선순위인 것 부터 값 정의
        
        return answer;
    }
}