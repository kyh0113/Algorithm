class Solution {
    public int[] solution(int[][] score) {
        double avg[] = new double[score.length]; // [75, 70, 55, 65]
        int answer[] = new int[score.length]; // [1, 2, 4, 3]
        for(int i =0; i<score.length; i++){
            avg[i] = (double) (score[i][0] + score[i][1])/2;
        }
        
        for(int i =0; i< score.length; i++){
            int index=1;
            for(int j =0; j< score.length; j++){
                if(avg[i]<avg[j]){
                    index++;
                }
            }
            answer[i]=index;
        }
        return answer;
    }
}