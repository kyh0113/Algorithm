class Solution {
    public int solution(int n) {
        int answer = 0;
        while(10<n/10){
            int a= n%10;
            answer+=a;
            n= n/10;
        }
        int one = n%10;
        int ten = n/10;
        answer= answer+one+ten;
        return answer;
    }
}

        // while(n>0){
        //     answer+=n%10;
        //     n/=10;
        // }