class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i =0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(sosu(nums[i]+nums[j]+nums[k])==true){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    public static boolean sosu(int total){
        if(total==1){
            return false;
        }
        for(int i =2; i<=Math.sqrt(total); i++){
            if(total%i==0){
                return false;
            }
        }
        return true;
    }
}