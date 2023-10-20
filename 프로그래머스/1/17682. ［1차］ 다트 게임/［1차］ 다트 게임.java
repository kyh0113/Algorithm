import java.util.*;
class Solution {
    public int solution(String dartResult) {
        Stack<Integer>stack = new Stack<>();
        int answer = 0;
        for(int i =0; i<dartResult.length(); i++){ // 10D4S10D
            char ch = dartResult.charAt(i);
            if(Character.isDigit(ch)){ // 숫자인 경우
                int dartInt = Character.getNumericValue(ch); // 만약 ch가 '7'이면 정수 7로 바꿔줌
                // 0~9까지가 아니라 0~10까지의 수가 들어올 수 있음
                if(dartInt==1 && dartResult.charAt(i+1)=='0'){ // 현재 위치에 다음 값이 0이면
                    dartInt =10;
                    i++; // 이걸 해줘야 온전히 10을 표현할 수 있음 이걸 안써주면 처음엔 10을 인식하겠지만 이거 끝나고 한칸만 앞으로 가면 0이 stack에 push됨
                }
                stack.push(dartInt); // 숫자만 push       27 8 2
            }else{ // 숫자가 아니면
                int prev = stack.pop();
                switch (ch){
                    case 'D':
                        prev = prev*prev;
                        break;

                    case 'T':
                        prev = prev*prev*prev;
                        break;

                    case '*':
                        prev *=2;  // 8
                        if(!stack.isEmpty()){
                            stack.push(stack.pop()*2); // 2
                        }
                        break;

                    case '#':
                        prev *=-1;
                        break;
                }
                stack.push(prev);
            }
        }
        while(!stack.isEmpty()){
            answer+=stack.pop();
        }
        return answer;
    }
}