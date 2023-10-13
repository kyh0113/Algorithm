class Solution {
    public String solution(int a, int b) {
        String answer ="";
        int[] date={31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 2016년 1월1일-1월7일 요일 순서 배열 1월 1일이 금요일임
        String[] day={"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int allDay = 0;
        for(int i =0; i<a-1; i++){
            allDay+=date[i]; // 4월달 까지의 일 수를 더해
        }
        //System.out.println(allDay);

        allDay += (b-1); // 5월 24 일까지의 일 수에 -1을 하는 이유는 인덱스가 0부터 시작하기 때문임
        answer=day[(allDay%7)];
        return answer;
    }
}