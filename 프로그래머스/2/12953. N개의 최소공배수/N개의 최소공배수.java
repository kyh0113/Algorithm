import java.util.*;
class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int answer = arr[0];
        for(int i =1; i<arr.length; i++){ // 2, 6, 8, 14
            int a = answer; // 그 전까지 계산된 최소공배수와
            int b = arr[i]; // 새로운 arr[i]를 가지고 다시 최소공배수를 구하기
            answer = LCM(a,b);
        }
        // System.out.println(answer);
        return answer;
    }
    private static int GCD(int a, int b){ // 최대공약수임
        if(a==0){
            return b;
        }
        return GCD(b%a, a);
    }

    private static int LCM(int a, int b){ // 최소공배수
        return a*b / GCD(a,b);
    }
}