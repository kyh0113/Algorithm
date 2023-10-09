import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        if(arr.length == 1){
            int answer[] ={-1};
            return answer;
        }

        int[] answer = new int[arr.length-1];

        int min = clone[0];
        
        int index=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == min){
                continue;
            }
            answer[index++] = arr[i]; 
            // index++로 안하고 i로 가면 인덱스가 0,1,3이런식으로 될 수 있음 
            // 그렇게 되면 런타임 에러  
        }

        return answer;
    }
}
