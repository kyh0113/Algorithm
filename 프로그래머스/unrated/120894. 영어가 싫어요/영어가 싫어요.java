class Solution {
    public long solution(String numbers) {
               long answer =0;
        String[] s = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < s.length; i++) {
            numbers = numbers.replaceAll(s[i], String.valueOf(i));
        }

        answer = Long.parseLong(numbers);

        return answer;
    }
}