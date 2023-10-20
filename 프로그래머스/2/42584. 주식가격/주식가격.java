class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length]; // 정답을 저장할 배열
        // 설명이 이해가 안가면 규칙을 보고 이해를 해야함
        // 일단 second++을 하고 본인보다 작은 애를 만나면 break
        for (int i = 0; i < prices.length; i++) { //i=2
            int second = 0;
            for (int j = i + 1; j < prices.length; j++) {
                second++; 
                if (prices[i] > prices[j]) { // 가격이 떨어지는 경우 반복문 종료
                    break;
                }
            }
            answer[i] = second; // 정답 배열에 기간 저장
        }
        //System.out.println(Arrays.toString(answer));
        return answer;
    }
}