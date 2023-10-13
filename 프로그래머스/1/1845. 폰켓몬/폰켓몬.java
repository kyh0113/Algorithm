import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer>set = new HashSet<>(); 
        int len = nums.length/2; // 최대 마리 확률
        for(int i =0; i<nums.length; i++){
            set.add(nums[i]);
        }
        answer = Math.min(set.size(), len);
        return answer;
    }
}