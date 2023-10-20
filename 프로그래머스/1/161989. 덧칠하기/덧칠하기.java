class Solution { // 걍 외워
    public int solution(int n, int m, int[] section) {
        int answer = 0;

        int size = section.length; // section 크기
        int next = section[0]; // 롤러가 지나갈 다음 자리
        int idx = 0; // section idx

        while( idx < size ) {
            if (next <= section[idx]) {
                next = section[idx] + m;// 롤러가 지나갈 다음 자리를 현재 section의 값에 덧셈으로 설정
                answer++;
            }
            idx++;
        }
        return answer;
    }
}