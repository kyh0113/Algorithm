import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
       int answer = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < ingredient.length; i++) {
            list.add(ingredient[i]);
        }
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1) {
                if (i > 2) {
                    if (list.get(i) == 1 && list.get(i-1) == 3 && list.get(i-2) == 2 && list.get(i-3) == 1) {
                        list.remove(i);
                        list.remove(i-1);
                        list.remove(i-2);
                        list.remove(i-3);
                        i-=4;
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}