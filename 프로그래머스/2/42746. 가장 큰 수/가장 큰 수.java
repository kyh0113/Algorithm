import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer ="";
        String[] arr = new String[numbers.length];
        // 문자열로 바꿔줌
        for(int i =0; i<numbers.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr, (a, b) -> (b+a).compareTo(a+b)); // 수가 커지는 경우를 앞에다가 (문자열버전 내림차순느낌)
        for(int i =0; i<arr.length; i++){
            answer+=arr[i];
        }
        int count=0;
        for(int i =0; i<answer.length(); i++){
            if(String.valueOf(answer.charAt(i)).equals("0")){
                count++;
            }
        }
        if(count==answer.length()){
            answer="0";
        }
        // System.out.println(answer);
        return answer;
    }
}