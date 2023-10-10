class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for(int i =0; i< db.length; i++){
            String arr[] = db[i]; // [rardss, 123]  [yyoom, 1234]  [meosseugi, 1234]
            if(arr[0].equals(id_pw[0]) && arr[1].equals(id_pw[1])){
                answer = "login";
            }else if(arr[0].equals(id_pw[0]) && !arr[1].equals(id_pw[1])){
                answer = "wrong pw";
            }else if(!arr[0].equals(id_pw[0]) && !arr[1].equals(id_pw[1])){
                answer = "fail";
            }
        }
        return answer;
    }
}