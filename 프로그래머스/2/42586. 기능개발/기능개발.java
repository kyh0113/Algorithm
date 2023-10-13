import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int arr[] = new int[progresses.length];
        int index=0;
        for(int i =0; i<progresses.length; i++){
            int sum=progresses[i];
            int day=0;
            while(sum<100){
                sum+=speeds[i]; //94 95 96 97 98 99 100
                day++; //1 2 3 4 5 6 7
            }
            if(sum>=100){
                arr[index++] = day;
            }
        }
        //System.out.println(Arrays.toString(arr)); // [1,10,10,10]
        List<Integer>list = new ArrayList<>();
        int count = 0;
        int start = arr[0]; // 1
        for(int i =0; i<arr.length; i++){ // [1,10,10,10]
            if(start>=arr[i]){ // 1>=1 10>=
                count++; // 1
            }else{ // 1<10
                list.add(count); //1
                count = 1;
                start = arr[i]; // 10
            }if(i==arr.length-1){
                list.add(count);
            }
        }
        int answer[] = new int[list.size()];
        for(int i =0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        // System.out.println(Arrays.toString(answer));
        return answer;
    }
}