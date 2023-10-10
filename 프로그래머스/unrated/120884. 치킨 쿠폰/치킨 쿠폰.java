class Solution {
    public int solution(int chicken) { // solution(1081)
        if(chicken / 10 <1){ // 주문한 치킨이 9마리 이하면
            return 0;
        }else{
            return chicken/10 + solution(chicken/10 + chicken%10); //solution(109)(19)(10)
        }
    }
}
// 1081 / 10 == 108 ...1
// 109 / 10 == 10 ...9
// 19 / 10 == 1 ...9
// 10 / 10 = 1
// 108 + 10 + 1 + 1