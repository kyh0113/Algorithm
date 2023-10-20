class Solution {
    public String solution(int[] numbers, String hand) {
        String answer="";
        int [][] keyPad ={{3,1},{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}}; // 0,1,2,3,4,5,6,7,8,9
        int [] left = {3,0}; // 왼손가락 초기 위치
        int [] right = {3,2}; // 오른손가락 초기 위치

        for(int num : numbers){
            int[] numPos = keyPad[num]; // 현재 위치
            // 열이 0이면 left 열이 2면 right
            if(numPos[1]==0){ // 열이 0이면 left *numPos[0]은 행, numPos[1]은 열
                answer+="L";
                left = numPos;
            }else if(numPos[1]==2){ // 열이 2면 right
                answer+="R";
                right = numPos;
            }else{ // 열이 1이면 거리가 가까운것이 기준이 됨 거리가 같으면 어떤 손잡이인지 확인한 후 작성
                int leftDistance = Math.abs(numPos[0]-left[0]) + Math.abs(numPos[1]-left[1]);
                int rightDistance = Math.abs(numPos[0]-right[0])+ Math.abs(numPos[1]-right[1]);
                if(leftDistance<rightDistance){
                    answer+="L";
                    left = numPos;
                }else if(leftDistance>rightDistance){
                    answer+="R";
                    right = numPos;
                }else if(leftDistance==rightDistance && hand.equals("right")){
                    answer+="R";
                    right = numPos;
                }else if(leftDistance==rightDistance && hand.equals("left")){
                    answer+="L";
                    left = numPos;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}