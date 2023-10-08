class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for(int i =0; i<control.length(); i++){
            if(String.valueOf(control.charAt(i)).equals("w")){
                n+=1;
            }else if(String.valueOf(control.charAt(i)).equals("s")){
                n-=1;
            }else if(String.valueOf(control.charAt(i)).equals("d")){
                n+=10;
            }else if(String.valueOf(control.charAt(i)).equals("a")){
                n-=10;
            }
        }
        answer = n;
        return answer;
    }
}