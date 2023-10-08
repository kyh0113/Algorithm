class Solution {
    public int[] solution(int[] num_list) {
        int count=0;
        int count2=0;
        for(int i =0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                count++;
            }else{
                count2++;
            }
        }
        int[] answer = {count, count2};
        return answer;
    }
}