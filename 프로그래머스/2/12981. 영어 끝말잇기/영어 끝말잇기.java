import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int answer[] = new int[2];
        Stack<String> stack = new Stack<>();
        stack.add(String.valueOf(words[0].charAt(words[0].length() - 1))); //k
        List<String>list = new ArrayList<>();
        list.add(words[0]);
//        Map<String, Integer> map = new HashMap<>();
//        map.put(words[0], map.getOrDefault(words[0], 0) + 1); //{tank=1}
//        System.out.println(map);

        for (int i = 1; i < words.length; i++) {
            String front = String.valueOf(words[i].charAt(0)); // 앞 알파벳 k
            String end = String.valueOf(words[i].charAt(words[i].length() - 1)); // 뒤 알파벳 k
            if (!stack.empty() && stack.peek().equals(front)) { // 끝말잇기가 잘 되었으면
                if(list.contains(words[i])){
                    break;
//                if (map.containsKey(words[i])) { // map에 key가 존재하는지 안하는지 확인
//                    break;
                } else {
                    list.add(words[i]);
//                    map.put(words[i], map.getOrDefault(words[i], 0) + 1);
//                    System.out.println(map);
                }
            } else if (!stack.empty() && !stack.peek().equals(front)) { // 끝말잇기가 잘 안되었으면
                break;
            }
            stack.add(end);
        }
        int person = list.size();
        //int person = map.size(); // 성공한 인원
        if(words.length==person){
            answer[0] = 0;
            answer[1] = 0;
        }else{
            answer[0] = (person%n)+1; // 번호
            answer[1] = (person/n)+1; // 차례
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}