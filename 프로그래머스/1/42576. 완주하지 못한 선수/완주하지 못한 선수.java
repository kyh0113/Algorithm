import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        // 해시맵 생성
        HashMap<String, Integer> hm = new HashMap<>();

        // 참가자 배열을 순회하면서 참가자 이름과 인원 수를 해시맵에 저장
        for (String player : participant)
            hm.put(player, hm.getOrDefault(player, 0) + 1);

        // 완주자 배열을 순회하면서 완주한 선수의 인원 수를 해시맵에서 차감
        for (String player : completion)
            hm.put(player, hm.get(player) - 1);

        // 해시맵을 순회하면서 인원 수가 0이 아닌 참가자를 찾아 반환
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }
}