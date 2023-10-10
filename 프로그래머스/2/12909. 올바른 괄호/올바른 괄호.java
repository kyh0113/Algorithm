import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<String>stack = new Stack<>(); // stack이 텅 비었으면 true 아니면 false
        // 일단 "("의 개수와 ")"의 개수가 일치한지부터 확인할까? 일치하지 않으면 false를 먼저 갈겨
        int len=s.length();

        int count = 0;
        for(int i =0; i<s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals("(")) {
                count++;
            }
        }

        if(len-count!=count){
            answer=false;
        }else{
            for(int i =0; i<s.length(); i++){
                if(String.valueOf(s.charAt(i)).equals("(")){
                    stack.add(String.valueOf(s.charAt(i)));
                }else{// ")" 이게 들어왔는데
                    if(stack.isEmpty()){ // stack에 "("이게 하나도 없으면
                        answer=false;
                        break;
                    }
                    stack.pop();
                }
                if(i==s.length()-1){
                    if(!stack.isEmpty()){
                        answer=false;
                    }
                }
            }
        }
        // System.out.println(answer);
        return answer;
    }
}