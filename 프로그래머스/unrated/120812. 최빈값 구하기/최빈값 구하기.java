class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int bin[] = new int[1000];
        for(int i =0; i<array.length; i++){ 
            bin[array[i]]++;
        }

        int max = 0;
        for(int i =0; i<bin.length; i++){
            if(max<bin[i]){
                max=bin[i];
                answer = i;
            }
        }

        int count = 0;
        for(int i =0; i<bin.length; i++){
            if(max==bin[i]){
                count++; 
                answer = i;
            }
        }
        if(count>1){
            answer = -1;
        }
        return answer;
    }
}