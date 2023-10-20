class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int size = sequence.length;
        int right;
        int left = 0;
        int sum = 0;

        for (right = 0; right < sequence.length; right++) { // k=5
            sum += sequence[right]; // right=3
            while(sum > k) {// while문이 아니라 if문을 쓰게 되면 sum에 값을 더했다가다 뺏다가를 반복하게됨
                sum -= sequence[left++];
            }
            if (sum == k) {
                if (size > right - left) { // 7>3
                    size = right - left;
                    answer[0] = left;
                    answer[1] = right;
                }
            }
        }
        //System.out.println(Arrays.toString(answer));
        return answer;
    }
}