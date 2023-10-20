import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int x[] = new int[10]; // 0~9까지의 숫자가 몇개 담겼는지 확인하기 위함
        int y[] = new int[10]; // 0~9까지의 숫자가 몇개 담겼는지 확인하기 위함

        List<Integer>list = new ArrayList<>();
        List<Integer>list2 = new ArrayList<>();

        for(int i =0; i<X.length(); i++){
            int temp = Integer.parseInt(String.valueOf(X.charAt(i)));
            x[temp]++;
        }

        for(int i =0; i<Y.length(); i++){
            int temp = Integer.parseInt(String.valueOf(Y.charAt(i)));
            y[temp]++;
        }

        for(int i =9; i>=0; i--){ // 큰수부터 넣겠다는 의미
            int count = Math.min(x[i], y[i]);
            for(int j =0; j<count; j++){//0~0, 0~1, 0~2가 범위가 되겠고
                answer.append(i);
            }
        }
        if("".equals(answer.toString())){
           return "-1";
        }else if(answer.toString().charAt(0)=='0'){
           return "0";
        }else {
            return answer.toString();
        }
    }
}