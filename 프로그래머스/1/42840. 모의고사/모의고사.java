import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        List<Integer>temp = new ArrayList<>();
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = new int[3];

        for(int i=0; i<answers.length; i++){
            if(pattern1[i%5] == answers[i]) count[0]++;
            if(pattern2[i%8] == answers[i]) count[1]++;
            if(pattern3[i%10] == answers[i]) count[2]++;
        }

        int max = 0;
        for(int i=0; i<3; i++) {
            if (max < count[i]) {
                max = count[i];
            }
        }
        for(int i=0; i<3; i++) {
            if (max == count[i]) {
                temp.add(i); // 인덱스를 보낸거임
            }
        }

        int answer[] = new int [temp.size()];
        for(int i =0; i< temp.size(); i++){
            answer[i] = temp.get(i)+1;
        }
        return answer;
    }
}