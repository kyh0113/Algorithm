class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int answer[] = new int[2];
        // denom1과 denom2의 최대공약수를 구하기
        int denom = denom1*denom2; // 분모
        int a1 = denom/denom1;
        int a2 = denom/denom2;
        numer1 = numer1*a1;
        numer2 = numer2*a2;
        int numer = numer1+numer2; // 분자

        int a = Math.max(numer, denom);
        int b = Math.min(numer, denom);

        while(b>0){
            int temp = a%b;
            a = b; // 결국 a가 최대공약수
            b = temp;
        }
        numer = numer/a;
        denom = denom/a;
        answer[0] = numer;
        answer[1] = denom;
        return answer;
    }
}