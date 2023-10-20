import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<String, Integer> map = new HashMap<>();
        for(int i =0; i< keymap.length; i++){ // 2번
            String[] key = keymap[i].split(""); // key[] ={"ABACD"};
            for(int j =0; j<key.length; j++){ // 0~4
                if(map.containsKey(key[j])){ // j가 2일때 A가 이미 map에 존재함
                    // B의 value가 2로 되어있겠지만 1로 업데이트 해야함
                    int value = map.get(key[j]);  // value = 1
    // System.out.println(key[j]+", "+value); -> A,1 B,2 C,4 D,5
                    if(value>j+1){
                        value = j+1;
                    }else{
                        value = value;
                    }
                    map.put(key[j], value);
                }else{
                    map.put(key[j],j+1);
                }
            }
        }
        int[] answer = new int[targets.length];
        for(int i =0; i<targets.length; i++){
            String[] word = targets[i].split("");
            int count=0;
            for(int j=0; j<word.length; j++){
                if(map.containsKey(word[j])){
                    count+=map.get(word[j]);
                }else{
                    count=-1;
                    break;
                }
            }
            answer[i] = count;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}