class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String arr[] = my_string.replaceAll("[a-zA-Z]"," ").split(" ");
        for(int i =0; i<arr.length; i++){
            if(!arr[i].equals("")){
                answer+= Integer.parseInt(arr[i]);
            }
        }
        
//         int answer = 0;
//         String s= my_string.replaceAll("[a-zA-Z]"," ");
//         System.out.println(s);
//         StringTokenizer stringTokenizer = new StringTokenizer(s," ");

//         while(stringTokenizer.hasMoreTokens()){
//             answer+=Integer.parseInt(stringTokenizer.nextToken());
//         }
        
        
        return answer;
    }
}