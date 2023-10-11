import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int answer [] = new int[commands.length];
        int index = 0;
        for(int i =0; i< commands.length; i++){
            List<Integer>list = new ArrayList<>();
            for(int j =commands[i][0]-1; j<commands[i][1]; j++){
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[index] = list.get(commands[i][2]-1);
            index++;
        }
        return answer;
    }
}