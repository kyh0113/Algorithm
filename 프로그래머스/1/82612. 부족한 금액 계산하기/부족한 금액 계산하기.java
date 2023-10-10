class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i =1; i<count+1; i++){
            answer+=i*price;
        }
        if(money-answer>=0){
            answer = 0;
        }else {
            answer = answer - money;
        }
        return answer;
    }
}