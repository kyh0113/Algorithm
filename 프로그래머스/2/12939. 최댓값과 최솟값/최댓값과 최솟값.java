import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] a =s.split(" ");
        int[] arr = new int[a.length];
        for(int i =0; i<a.length; i++){
            arr[i] = Integer.parseInt(a[i]);
        }
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        answer = String.valueOf(min)+" "+String.valueOf(max);
        // System.out.println(answer);
        return answer;
    }
}