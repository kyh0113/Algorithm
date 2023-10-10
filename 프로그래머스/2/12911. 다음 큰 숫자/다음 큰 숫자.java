class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        String s = Integer.toBinaryString(n);
        for(int i =0; i<s.length(); i++){
            if(String.valueOf(s.charAt(i)).equals("1")){
                count++; //4
            }
        }


        for(int i =n+1; i<=1000000; i++){ // 79
            String S = Integer.toBinaryString(i); // 1001111
            int count2=0;
            for(int j =0; j<S.length(); j++){
                if(String.valueOf(S.charAt(j)).equals("1")){
                    count2++;
                }
            }
            if(count==count2){
                answer=i;
                break;
            }
        }
        // System.out.println(answer);
        return answer;
    }
}