class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        int count = 0;
        for(int i =0; i< dic.length; i++){
            String s = dic[i]; 
            for(int j =0; j<spell.length; j++){
                if(!s.contains(spell[j])){ 
                    count++; // 3 포함 안되는것: def, dww, loveaw
                    break;
                }
            }
        }
        if(count!=dic.length){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }
}