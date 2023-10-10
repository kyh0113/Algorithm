import java.util.*;
class Solution{
    public int solution(int []A, int []B){
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int[] C = new int[B.length];
        int index=0;
        for(int i=B.length-1; i>=0; i--){
            C[index++] = B[i];
        }
        int[] temp=new int[A.length];
        for(int i =0; i<A.length; i++){
            temp[i] = A[i]*C[i];
        }
        for(int i =0; i<temp.length; i++){
            answer+=temp[i];
        }
        // System.out.println(answer);
        return answer;
    }
}