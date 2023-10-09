class Solution {
    public String solution(int age) {
        String answer = "";
        char alpabet[] ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String a = String.valueOf(age);
        for(int i =0; i<a.length(); i++){
            int b = Integer.parseInt(String.valueOf(a.charAt(i)));
            answer += alpabet[b];
        }
        return answer;
    }
}