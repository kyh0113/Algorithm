import java.util.*;
// class Solution {
//     public int solution(int number, int limit, int power) {
//         int answer = 0;
//         int arr[] = new int[number];
//         for(int i =0; i<number; i++){
//             int num = Factors(i+1);
//             arr[i]=num;
//         }
//         Arrays.sort(arr);
//         int index = lowerBound(limit, arr); // limit은 2고 4가 반환된었음

//         if(index==arr.length-1){ //
//             for(int i =0; i<=index; i++){
//                 answer+=arr[i];
//             }
//         }else{
//             for(int i =0; i<index+1; i++){
//                 answer+=arr[i];
//             }
//             for(int i = index+1; i<arr.length; i++){
//                 answer+=power;
//             }
//         }
//         return answer;
//     }
    
//     private static int Factors(int n){ // Math.sqrt를 사용하여 약수의 개수를 빠르게 구함
//         int count = 0;
//         int dupCount = 0;
//         for(int i =1; i<=(int)Math.sqrt(n); i++){
//             if(n%i==0){
//                 count++;
//             }
//             if(i*i==n){
//                dupCount++;
//                continue;
//             }
//         }
//         return (count*2)-dupCount;
//     }
    
//     public static int lowerBound(int limit, int[] arr){
//         int left = 0;
//         int right = arr.length;
//         //int right = arr.length-1;
//         // if(arr[right]<=limit){ // [1, 2, 2, 2, 3] 3<=3 3까지 괜찮음
//         //     return right;
//         // }else{ // [1, 2, 2, 2, 3] 3>3
//             while(left<right){ // 2가 limit이라면 3이 시작하는 시점을 리턴해야함
//                 int mid = (left+right)/2;
//                 if(arr[mid]<limit+1){
//                     left = mid+1;
//                 }else{
//                     right = mid;
//                 }
//             }
//             return left-1; // index 3이 반환되야함
//         }
//     }
// //}


class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int count[] = new int[number+1];
        // 약수개수 먼저 구해
        for(int i =1; i<=number; i++){
            for(int j=1; j<=number/i; j++){ // 시간 초과나서
                  count[i*j]++; // 이렇게 수정함
            }
        }
        
        for(int i =0; i<count.length; i++){
            if (count[i] > limit) {
                answer += power;
            } else {
                answer += count[i];
            }
        }
        return answer;
    }
}



//         int[] count = new int[number + 1];    
//         for (int i = 1; i <= number; i++) {
//             for (int j = 1; j <= number / i; j++) {
//                 count[i * j]++;
//             }
//         }
//         int answer = 0;
//         for (int i = 1; i <= number; i++) {
//             if (count[i] > limit) {
//                 answer += power;
//             } else {
//                 answer += count[i];
//             }
//         }
//         return answer;
//     }
// }