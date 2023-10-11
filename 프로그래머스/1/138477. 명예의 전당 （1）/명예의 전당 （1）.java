import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
         int[] answer=new int[score.length];
         List<Integer>list = new ArrayList<>();

         for(int i =0; i< score.length; i++){
             list.add(score[i]);
             Collections.sort(list);

             if(i<k){
                 answer[i]=list.get(0);
             }else{ // 명예의 전당 멤버 중에서 꼴등을 발표
                 answer[i]=list.get(i-k+1);
             }
         }
        return answer;
    }
}
//          int[] answer=new int[score.length];
//          Queue<Integer>queue = new PriorityQueue<>(); // 오름차순

//          for(int i =0; i< score.length; i++){
//              queue.add(score[i]);
//              if(queue.size()<=k){ // 0 1 2 3
//                  answer[i] = queue.peek(); // 첫번째꺼 peek
//              }else{
//                  queue.remove(); // 첫번째꺼 remove
//                  answer[i]=queue.peek();
//              }
//          }