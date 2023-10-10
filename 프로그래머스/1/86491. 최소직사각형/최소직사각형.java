class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[][] temp = new int[sizes.length][2];
        for (int i = 0; i < sizes.length; i++) {
            int min = Math.min(sizes[i][0],sizes[i][1]);
            temp[i][0] = min;
            int max = Math.max(sizes[i][0],sizes[i][1]);
            temp[i][1] = max;
        }
//        for(int i = 0; i< temp.length; i++){
//            System.out.println(temp[i][0]);
//            System.out.println(temp[i][1]);
//        }
        int max1 = 0;
        int max2 = 0;
        for(int i =0; i<temp.length; i++){
            if(max1<temp[i][0]){
                max1 = temp[i][0];
            }if(max2<temp[i][1]){
                max2 = temp[i][1];
            }
        }
        answer = max1*max2;
        return answer;
    }
}