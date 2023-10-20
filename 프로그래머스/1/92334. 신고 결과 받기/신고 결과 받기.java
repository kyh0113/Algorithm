import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 각 유저별로 신고당한 횟수를 저장하는 맵
        Map<String, Integer> count = new HashMap<>();

        // 각 유저가 신고한 유저들을 저장하는 맵
        Map<String, Set<String>> users = new HashMap<>();

        // report 배열을 순회하며 유저들의 신고 정보를 파싱하여 맵에 저장
        for (String r : report) {
            String[] s = r.split(" ");
            String a = s[0]; // 신고한 유저
            String b = s[1]; // 신고당한 유저

            // 신고한 유저가 이미 해당 유저를 신고한 경우, 중복 신고로 처리하지 않도록 확인
            Set<String> set = users.getOrDefault(a, new HashSet<>());
            if (!set.contains(b)) {
                // 해당 유저를 처음 신고하는 경우, 신고 횟수를 1 증가시키고 신고한 유저 목록에 추가
                count.put(b, count.getOrDefault(b, 0) + 1);
                set.add(b);
                users.put(a, set);
            }
        }
        // System.out.println(count); {muzi=1, neo=2, frodo=2}
        // System.out.println(users); {muzi=[neo, frodo], frodo=[neo], apeach=[muzi, frodo]}

        // 정지된 유저들을 저장하는 집합
        Set<String> bannedUsers = new HashSet<>();
        
        // 정지 기준을 충족하는 유저를 찾아서 bannedUsers 집합에 추가
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue() >= k) {
                bannedUsers.add(entry.getKey());
            }
        }
        // System.out.println(bannedUsers); [neo, frodo]

        // 결과 메일을 받은 횟수 계산
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            Set<String> reportedUsersSet = users.getOrDefault(user, new HashSet<>());
            for (String reportedUser : reportedUsersSet) {
                if (bannedUsers.contains(reportedUser)) {
                    answer[i]++;
                }
            }
        }

        System.out.println(Arrays.toString(answer));
        return answer;
            
    }
}