import java.util.*;
class Solution{
    public int solution(String s){
        int answer = 0;
        Stack<String>stack = new Stack<>();

        for(int i =0; i<s.length(); i++) {
            if(!stack.isEmpty() && stack.peek().equals(String.valueOf(s.charAt(i)))){//stack이 비어있지 않다는 조건이 꼭 있어야함
                stack.pop();
            }else{
                stack.add(String.valueOf(s.charAt(i)));
            }
        }
        if(stack.isEmpty()){
            answer=1;
        }else{
            answer=0;
        }
        // System.out.println(answer);
        return answer;
    }
}