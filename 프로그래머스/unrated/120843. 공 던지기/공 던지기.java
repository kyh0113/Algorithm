class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count = 0;
        for(int i =0; i<k-1; i++){
            count = count+2;
            if(count>numbers.length-1){ // 길이는 6이어도 인덱스로 치면 5니깐 -1해줌
                count = count-numbers.length;
            }
            answer = numbers[count];
        }
        return answer;
    }
}