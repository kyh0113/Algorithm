class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 두개의 0이 다 맞았을 경우와 다 틀렸을 경우를 구하기
        int[] answer= new int[2]; // 높은등수, 낮은등수
        // 읻단 0을 제외하고 몇개의 숫자가 당첨되었는지 확인을 하기
        int count = 0;
        int zero = 0;
        for(int i =0; i<lottos.length; i++){
            // lottos에 0의 개수가 몇개인지 확인
            if(lottos[i]==0){
                zero++;
            }
            for(int j=0; j< win_nums.length; j++){
                if(lottos[i]==win_nums[j]){
                    count++;
                }
            }
        }
        int best = count+zero;
        int worst = count;
        
        answer[0] = 6-best+1;
        answer[1]=6-worst+1;
        if(worst<=1){
            answer[1] = 6;
        }if(best<=1){
            answer[0] = 6;
        }
        return answer;
    }
}