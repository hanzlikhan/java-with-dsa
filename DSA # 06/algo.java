// public class algo{
//     public static int search(int num[],int target){
//             int left = 0; // 5
//             int right = num.length-1;
//             while(left<=right){
//                 int mid = left + (right-left)/2;  //3
//                 if(num[mid]==target){
//                     return mid;
//                 }
//                 if (num[left]<=num[mid]) {  
//                     if(target>=num[left] && target<num[mid]){
//                         right = mid-1;
//                     }else{
//                         left = mid + 1; //6
//                     }
//                 }else{
//                     if(target>num[mid]&&target<=num[right]){
//                         left = mid+1;
//                     }else{
//                         right = mid -1;   
//                     }
//                 }
//             }
//             return -1;
//     }
//     public static void main(String args[]){
//             int number[] = {4,5,6,7,0,1,2};
//             int target = 0;
//             int index = search(number, target);
//             if(index != -1){
//                 System.out.println("target" + target + " found at index "+ index);
//             }else{
//                 System.out.println("target" + target + "not found in an array");
//             }
//     }
// }