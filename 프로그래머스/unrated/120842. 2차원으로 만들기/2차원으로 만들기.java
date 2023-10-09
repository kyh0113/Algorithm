class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int segment = 0;
        for(int i =0; i< num_list.length/n; i++){ // 4
            for(int j =0; j<n; j++){ // 2
                answer[i][j] = num_list[segment];
                segment++;
            }
        }
        return answer;
    }
}