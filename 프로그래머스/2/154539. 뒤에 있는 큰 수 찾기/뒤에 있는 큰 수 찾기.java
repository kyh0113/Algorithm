import java.util.*;
class Solution { // 제한사항을 보면 길이가 길어 그래서 이중for문 말고 stack이용해
    public int[] solution(int[] numbers) {
        int answer[] = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numbers.length; i++) { // i=3
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]){ //3<5 스택이 비지 않았어 3<5
                //System.out.println(numbers[i]); // 3
                answer[stack.pop()] = numbers[i]; // answer[0]=3 answer[2]=5 answer[1]=5
            }
            stack.push(i); // [3]
            //System.out.println(stack);
        }
        while(!stack.isEmpty()){ // stack에 [3]이 담겨있음
            answer[stack.pop()] = -1; // 해당 자리에 pop
        }
        return answer;
    }
}