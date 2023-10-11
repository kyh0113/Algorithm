import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people); // 사람의 몸무게를 오름차순으로 정렬
        // 가장 가벼운 사람과 무거운 사람을 합했을 때 limit 이하인지 확인하면서 진행

        int left=0;
        int right=people.length-1;
        
        while(left<=right){
            if(people[left] + people[right]<=limit){
                left++;
            }
            right--;
            answer++;
        }
        // System.out.println(answer);
        return answer;
    }
}