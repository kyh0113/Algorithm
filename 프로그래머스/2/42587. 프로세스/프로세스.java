import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>(); // 배열로 저장
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]}); // 인덱스랑 같이 queue에 offer
            temp.add(priorities[i]);
        }

//        for (int[] item : queue) {
//            int index = item[0];
//            int value = item[1];
//            System.out.println("Index: " + index + ", Value: " + value);
//        }
//        Index: 0, Value: 2
//        Index: 1, Value: 1
//        Index: 2, Value: 3
//        Index: 3, Value: 2


        Collections.sort(temp, Collections.reverseOrder()); // [3,2,2,1]

        int idx = 0;
        int count = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll(); //(0,2)
            if (current[1] != temp.get(idx)) { // temp=[3,2,2,1]
                queue.offer(current);
            } else {
                count++;
                if (current[0] == location) {
                    break;
                }
                if (idx == temp.size() - 1) {
                    break;
                }
                idx++;
            }
        }
        
        return count;
    }
}