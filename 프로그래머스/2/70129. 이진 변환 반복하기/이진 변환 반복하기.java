import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count1 = 0;
        int count2 = 0;
        String temp="";
        while(!s.equals("1")){
            temp ="";
            for(int i =0; i<s.length(); i++){
                if(String.valueOf(s.charAt(i)).equals("1")){
                    temp+=String.valueOf(s.charAt(i)); // 1
                }else{
                    count1++; // 0이 나올때마다 카운트
                }
            }
            int c = temp.length(); 
            s = Integer.toBinaryString(c); // 1
            count2++; // 4
        }
        answer[0]=count2;
        answer[1]=count1;
        // System.out.println(Arrays.toString(answer));
        return answer;
    }
}