import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min=100;
        Arrays.sort(array);
        // array에서 n을 빼본 절대값 중 가장 작은게 답
        for(int i =0; i< array.length; i++){
            if(min>Math.abs(array[i]-n)){
                min=Math.abs(array[i]-n);
                answer = array[i];
            }
        }
        return answer;
    }
}