class Solution {
    public String solution(String[] survey, int[] choices) {
        int RT=0;
        int CF=0;
        int JM=0;
        int AN=0;
        for(int i=0; i<survey.length; i++){
            String[] split = survey[i].split("");
            if(split[0].equals("R")){
                RT += cal(choices[i]);
            } else if (split[1].equals("R")) {
                RT -= cal(choices[i]);
            }
            if(split[0].equals("C")){
                CF += cal(choices[i]);
            } else if (split[1].equals("C")) {
                CF -= cal(choices[i]);
            }
            if(split[0].equals("J")){
                JM += cal(choices[i]);
            } else if (split[1].equals("J")) {
                JM -= cal(choices[i]);
            }
            if(split[0].equals("A")){
                AN += cal(choices[i]);
            } else if (split[1].equals("A")) {
                AN -= cal(choices[i]);
            }
        }
        String answer="";
        if(RT>=0) {
            answer += "R";
        }
        else answer += "T";
        if(CF>=0){
            answer +="C";
        }else  answer +="F";
        if(JM>=0){
            answer +="J";
        }else  answer +="M";
        if(AN>=0){
            answer +="A";
        }else  answer +="N";
        // System.out.println(answer);
        return answer;
    }

    public static int cal(int n){
        switch (n){
            case 1 : return 3;
            case 2 : return 2;
            case 3 : return 1;
            case 4 : return 0;
            case 5 : return -1;
            case 6 : return -2;
            case 7 : return -3;
            default: break;
        }
        return 0;
    }
}