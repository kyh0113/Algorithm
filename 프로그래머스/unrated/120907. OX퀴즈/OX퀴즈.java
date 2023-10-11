class Solution {
    public String[] solution(String[] quiz) {
        String[]answer = new String[quiz.length];
        for(int i =0; i<quiz.length; i++){
            String[] a = quiz[i].split(" ");
            int x = Integer.parseInt(a[0]);
            for(int j =0; j<a.length; j++){
                if(a[j].equals("+")){
                    x+=Integer.parseInt(a[j+1]);
                } else if (a[j].equals("-")){
                    x-=Integer.parseInt(a[j+1]);
                }
            }
            if(x==Integer.parseInt(a[a.length-1])){
                answer[i]= "O";
            }else{
                answer[i]="X";
            }
        }
        return answer;
    }
}