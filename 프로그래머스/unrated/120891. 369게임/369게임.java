class Solution {
    public int solution(int order) {
        int answer = 0;
        String num = String.valueOf(order);
        for(int i =0; i<num.length(); i++){
            int a = Integer.parseInt(String.valueOf(num.charAt(i)));
            if(a==3 || a==6 || a==9){
                answer++;
            }
        }
        return answer;
    }
}