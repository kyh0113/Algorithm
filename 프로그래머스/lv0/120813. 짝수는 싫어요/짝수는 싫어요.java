class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2]; // 0 1 2 3 4 5
        for(int i =1; i<n+1; i++){// 1 2 3 4 5 6 7 8 9 10
            if(i%2!=0){ // 홀수라면
                answer[i/2] = i;
            }
        }

        return answer;
    }
}