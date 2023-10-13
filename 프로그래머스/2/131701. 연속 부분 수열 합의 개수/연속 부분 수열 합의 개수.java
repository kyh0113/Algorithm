import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer>set = new HashSet<>();
        for(int i =0; i<elements.length; i++){ // {7,9,1,1,4}
            int end = i-1;
            int idx = i;
            int sum = 0;
            if(end < 0){
                for(int j =i; j< elements.length; j++){ // 인덱스 0번을 기준으로 길이1부터 5까지 계산
                    sum+=elements[j]; // 7 16 17 18 22
                    set.add(sum);
                }
                // 이거 다 돌면 end =i가 됨
            }else{ // end >= 0
                while(idx!=end){ // 길이 5까지는 한번만 구하면 돼
                    sum+=elements[idx++]; //
                    // System.out.println(sum);
                    set.add(sum);
                    if(idx>=elements.length){
                        idx=0; // 앞에 원소를 더하기 위함 이걸 거치고 조금 안가서 while문을 끝내게 됨
                    }
                }
                //System.out.println();
            }
        }
        // System.out.println(set.size());
        answer = set.size();
        return answer;
    }
}