class Solution {
    public String solution(int[] food) {
        String answer="";
        for(int i =1; i<food.length; i++){
            int a = food[i]/2;
            answer += String.valueOf(i).repeat(a);
        }
        String re_answer = new StringBuilder(answer).reverse().toString();

        answer+="0"+re_answer;
        return answer;
    }
}