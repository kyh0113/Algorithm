import java.util.*;    
class Solution {
        public static int answer = 0;
        public static boolean[] visit;

        public static int solution(int k, int[][] dungeons) {
            visit = new boolean[dungeons.length];
            dfs(0, k, dungeons);
            // System.out.println(answer);
            return answer;
        }

        public static void dfs(int depth, int k, int[][] dungeons) {
            for (int i = 0; i < dungeons.length; i++) { //0
                if (!visit[i] && dungeons[i][0] <= k) {
                    visit[i] = true;
                    dfs(depth + 1, k - dungeons[i][1], dungeons);
                    visit[i] = false;
                }
            }
            answer = Math.max(answer, depth); // 0,2
        }
    }