import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int []answer = new int[2];
        int totalBlocks = brown + yellow;

        for (int width = 3; width <= totalBlocks; width++) { // 가로의 길이는 3보다 작을 수가 없음
            int height = totalBlocks / width;
            if (totalBlocks % width == 0 && width >= height) {
                int brownBlocks = (2 * width) + (2 * height) - 4;
                if (brownBlocks == brown) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }
        // System.out.println(Arrays.toString(answer));
        return answer;
    }
}