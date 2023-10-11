import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine); //1,2,2,3,3,4,5,5
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        } // {1=1, 2=2, 3=2, 4=1, 5=2}

        List<Integer>list = new ArrayList<>(map.values()); // map의 value를 넣음
        Collections.sort(list, Collections.reverseOrder()); // [2, 2, 2, 1, 1]
        
        for(int i=0; i<list.size(); i++){
            k-=list.get(i);
            answer++;
            if(k<=0){
                break;
            }
        }
        return answer;
    }
}