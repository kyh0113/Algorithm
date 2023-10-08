class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1]; //3
        for(int i =0; i<num2-num1+1; i++){ //0,1,2
            answer[i]=numbers[num1+i];
        }
        
        return answer;
    }
}