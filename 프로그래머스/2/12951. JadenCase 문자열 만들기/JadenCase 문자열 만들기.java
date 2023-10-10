class Solution {
    public String solution(String s) {
        String answer="";
        boolean newWord = false;
        String arr[] = new String[s.length()];
        for(int i =0; i<s.length(); i++){
            arr[i] = String.valueOf(s.charAt(i));
        }
        for(int i =0; i<arr.length; i++){
            if(arr[i].equals(" ")){
                newWord = true; // 새로운 문자 시작
                answer+=arr[i]; // 공백으로 채워~
            }else if(i==0){
                answer+=arr[i].toUpperCase(); // 시작은 대문자
            }else{
                if(newWord==true){
                    answer+=arr[i].toUpperCase();
                    newWord=false;
                }else{
                    answer+=arr[i].toLowerCase();
                }
            }
        }
        // System.out.println(answer);
        return answer;
    }
}