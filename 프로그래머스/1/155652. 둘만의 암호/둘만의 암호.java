class Solution {
    static int idx;
    public String solution(String s, String skip, int index) {
        String answer = "";
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        
        for (int i = 0; i < skip.length(); i++) {
            String a = skip.charAt(i) + "";
            alpha = alpha.replace(a, "");
        }

        // acefghijklmnoprstuvxyz
        
        for(int i =0; i<s.length(); i++){
            String key = String.valueOf(s.charAt(i));
            idx = alpha.indexOf(key)+index; //5,0,13,13,20
            //만약 index가 50이고 idx가 예를들어 55, alpha 길이가 10일 때  55-10=45인데 alpha길이가 10밖에 안돼서 alpha의 45번째 값을 찾을 수 없음
            if(alpha.length()-1<idx){
                idx = idx%alpha.length();
            }

            answer+=alpha.charAt(idx);
        }
        
        return answer;
    }
}