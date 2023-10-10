import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;

        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) { // 1,2,3,4,5    7
            sum += d[i]; // 1+2+3+4
            if (sum <= budget) {//1<=9, 3<=9, 6<=9
                answer++;//+1 +1 +1
            } else {
                break;
            }
        }
        return answer;
    }
}