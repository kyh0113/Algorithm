class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a =i; a<j+1; a++){
            String s = String.valueOf(a);
            for(int b=0; b<s.length(); b++){
                if(String.valueOf(s.charAt(b)).equals(String.valueOf(k))){
                    answer++;
                }
            }
        }
        return answer;
    }
}