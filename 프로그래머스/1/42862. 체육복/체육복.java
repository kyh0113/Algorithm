import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        // 여벌 옷을 가져온 학생도 체육복을 도난당할 수 있다고 문제에서 가정함
        // 진짜 여벌옷 가진애들과 잃어버린 애들만 골라보겠음
        Set<Integer> reverse1 = new HashSet<>();
        Set<Integer> lost1 = new HashSet<>();
        for(int e : reserve){
            reverse1.add(e);
        }
        for(int e : lost){
            lost1.add(e);
        }

        Set<Integer>reverse_only = new HashSet<>(reverse1);
        Set<Integer>lost_only = new HashSet<>(lost1);
        reverse_only.removeAll(lost1);
        lost_only.removeAll(reverse1);

        // 여분을 기준으로 앞뒤를 확인하여 체육복 빌려주기
        for(int r : reverse_only){
            int front = r-1;
            int back = r+1;
            if(lost_only.contains(front)){
                lost_only.remove(front);
            }else if(lost_only.contains(back)){
                lost_only.remove(back);
            }
        }
        Set<Integer>set = new HashSet<>(lost_only);
        answer = n-set.size();
        return answer;
    }
}