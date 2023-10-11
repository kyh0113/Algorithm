class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String temp = "";
        int count = 0;
        for(int i =0; i<n; i++){
            // or연산을 수행하고 10진수를 2진수로 변형
            temp = Integer.toBinaryString(arr1[i] | arr2[i]);
            
            // 앞에 0을 count번 넣어줌
            if(temp.length()<n){
               count = n-temp.length();
                for(int j=0; j<count; j++){
                    temp="0"+temp;
                }
            }
            temp = temp.replaceAll("1", "#");
            temp = temp.replaceAll("0"," ");
            //System.out.println(temp);
            answer[i] = temp;
        }
        return answer;
    }
}