class Solution {
    public String solution(String my_string) {
        String answer ="";
        for(int i =0; i<my_string.length();i++){
            if('a'<=my_string.charAt(i)&&'z'>=my_string.charAt(i)){
                String a =String.valueOf(my_string.charAt(i));
                answer +=a.toUpperCase();
            }else{
                String b =String.valueOf(my_string.charAt(i));
                answer += b.toLowerCase();
            }
        }
        return answer;
    }
}