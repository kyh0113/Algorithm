class Solution {
    public int solution(int hp) {
        int answer = 0;
        int arr[] ={5,3,1};
        while(hp>0){
            for(int i =0; i<arr.length; i++){
                answer+=hp/arr[i];
                hp=hp%arr[i];
            }
        }
        return answer;
    }
}