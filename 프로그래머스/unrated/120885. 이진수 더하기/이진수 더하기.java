class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        // 문자열 모양의 2진수를 10진수로 변환하여 계산 -> int a는 10진수
        int a=Integer.parseInt(bin1,2)+Integer.parseInt(bin2,2);
        // 10진수 a를 2진수로 변환 후 String answer에 대입
        answer=Integer.toBinaryString(a);
        return answer;
    }
}