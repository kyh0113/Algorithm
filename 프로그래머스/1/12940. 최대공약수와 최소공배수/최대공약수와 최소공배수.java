class Solution {
    public int[] solution(int n, int m) {
        int answer[] = new int[2];
        int a  = Math.max(n, m); 
        int b = Math.min(n,m); 
        while(b>0){
            int temp = a%b; 
            a=b; 
            b=temp; 
        }
        answer[0] = a;
        answer[1] = a*(n/a)*(m/a);
        return answer;
    }
}