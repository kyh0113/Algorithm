import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int min = Math.min(a,b);
        int x = 1;
        for(int i =1; i<=min; i++){
            if(a%i==0 && b%i==0){
                x = i;
            }
        }
        a = a/x; // 얜 더이상 필요 없음
        Set<Integer> set = new HashSet<>();
        b= b/x;
        System.out.println(a+" "+b);
        int d = 2;
        while(b>1){
            if(b%d==0){
                set.add(d);
                b=b/d;
            }else{
                d++;
            }
        }

        List<Integer> list = new ArrayList<>(set);
        list.remove(Integer.valueOf(2));
        list.remove(Integer.valueOf(5));
        if(list.size()==0){
            answer=1;
        }else{
            answer=2;
        }
        return answer;
    }
}