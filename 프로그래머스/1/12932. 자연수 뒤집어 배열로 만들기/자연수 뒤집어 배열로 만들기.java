class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int [s.length()];
        for(int i =s.length()-1; i>=0; i--){ // 4,3,2,1,0
            answer[answer.length-1-i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return answer;
    }
}