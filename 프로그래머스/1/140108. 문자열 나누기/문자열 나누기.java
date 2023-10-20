class Solution {
    public int solution(String s) {
        int answer = 0;
        int count1 = 1;
        int count2 = 0;

        for (int i = 1; i < s.length(); i++) { 
            String pre = String.valueOf(s.charAt(0)); 
            String cre = String.valueOf(s.charAt(i)); 
            if (!cre.equals(pre)) {
                count2++; 
            } else if (cre.equals(pre)) {
                count1++;
            }
            if (count1 == count2) {
                answer++; 
                s = s.substring(count1 + count2); 
                if(s.length()==0){
                    break;
                }
                count1 = 1;
                count2 = 0;
                i = 0;
            }
        }

        if(count1!=count2){
            answer++;
        }


        return answer;
    }
}