import java.util.*;

public class Solution {
    public int solution(int n) {
                int answer = 0;
        // 계속해서 거리를 짝수로 만들어주면서 최대한 순간이동 할 수 있도록 구현
        while(n>0){
            if(n%2==1){
                n--; // 한칸 줄여
                answer++; // 배터리 1사용
            }else{
                n/=2;
            }
        }
        //System.out.println(answer);
        return answer;
    }
}