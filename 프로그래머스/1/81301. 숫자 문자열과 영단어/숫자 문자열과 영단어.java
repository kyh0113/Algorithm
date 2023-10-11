class Solution {
    public int solution(String s) {
        String[] num ={"zero", "one","two","three","four","five","six","seven","eight","nine"};
        int answer = 0;
        for(int i =0; i<num.length; i++){
            s = s.replaceAll(num[i], String.valueOf(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}