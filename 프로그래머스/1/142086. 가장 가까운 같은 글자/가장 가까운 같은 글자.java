class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        // s = banana
        for(int i =0; i<s.length(); i++){ 
            String a = s.substring(i, i+1); 
            int b = s.lastIndexOf(a, i-1);  // a를 i-1 이전에서 찾는다 찾지 못하면 -1을 반환
            if(b==-1){                              
                answer[i] = -1;
            }else{
                answer[i] = i - b; // 현재 인덱스에서 같은 값의 최근 인덱스 값 b를 빼기
            }
        }
        return answer;
    }
}