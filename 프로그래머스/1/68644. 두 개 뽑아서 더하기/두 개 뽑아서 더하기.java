import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer>set = new HashSet<>();
        for(int i =0; i<numbers.length-1; i++){
            for(int j =i+1; j<numbers.length; j++){
                int x = numbers[i]+numbers[j];
                set.add(x);
            }
        }
        int answer [] = new int[set.size()];
        List<Integer>list = new ArrayList<>(set);
        for(int i =0; i<set.size(); i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}