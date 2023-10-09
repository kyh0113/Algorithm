import java.util.*;
class Solution {
    public String solution(String my_string) {
      String answer = "";
        String a = my_string.toLowerCase();

        char arr[] = a.toCharArray(); // 문자열을 캐릭터 배열로 만들어 담아버리기
        Arrays.sort(arr);
        answer = new String(arr); // 객체를 만들어서 담아
//        for(int i =0; i<arr.length; i++){
//            answer+=arr[i];
//        }
        return answer;
    }
}