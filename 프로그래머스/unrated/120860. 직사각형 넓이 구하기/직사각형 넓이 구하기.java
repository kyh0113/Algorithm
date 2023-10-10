class Solution {
    public int solution(int[][] dots) {
                int xMin = 256;
        int xMax = -256;
        int yMin = 256;
        int yMax = -256;
        for(int i =0; i<4; i++){
            xMin = Math.min(xMin, dots[i][0]);
            xMax = Math.max(xMax, dots[i][0]);
            yMin = Math.min(yMin, dots[i][1]);
            yMax = Math.max(yMax, dots[i][1]);
        }
        int width = xMax -xMin;
        int height = yMax -yMin;
        int answer = width*height;
        return answer;
    }
}