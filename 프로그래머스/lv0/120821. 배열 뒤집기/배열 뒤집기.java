class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i=0;i<num_list.length; i++){ // 0,1,2,3,4
            answer[i]=num_list[num_list.length-i-1]; // 5-0-1, 5-2-1, 5-3-1
        }
        return answer;
    }
}