import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
         int answer = 0;
         int[] newScore = new int[score.length];
         Arrays.sort(score);
         for(int i =0; i<score.length; i++){
             newScore[score.length-1-i]=score[i];
         }
         for(int i =0; i<newScore.length; i++){
             if((i+1)%m==0){
                 answer+=newScore[i]*m;
             }
         }
         return answer;
    }
}