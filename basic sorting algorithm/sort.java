
// counting sort
// public class sort{
//     public static void counting(int num[]){
//         //  in counting first rule is find the largest number in array
//         int large = Integer.MIN_VALUE;
//         for(int i=0 ; i<num.length;i++){
//             large  = Math.max(large, num[i]);
//         }
//         //  count the frequency of number mean the repeated or non repeated number 
//         int count[] = new int[large+1];
//         for(int i=0;i<num.length;i++){
//             count[num[i]]++;
//         }
//         //  for Sort the array ,   
//         int j=0;  // make variable for store the element in the array
//         for(int i=0;i<count.length;i++){
//             while (count[i]>0) {
//                 num[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }    
//     public static void print(int num[]){
//         for(int i=0;i<num.length;i++){
//             System.out.print(num[i]+ " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int number[] = {1,0,5,9,0};
//         counting(number);
//         print(number);
//     }
// }

// insertion sort         like a cards taash
//  public class sort{
//     public static void insert(int num[]){
//         for(int i=1;i<num.length;i++){
//             int curr = num[i];
//             int prev = i-1;
//             while (prev>=0&& num[prev]>=curr) {
//                 num[prev+1]=num[prev];
//                 prev--;
//             }
//             num[prev+1] = curr;
//         }
//     }
// // 
//     public static void display(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int number[] = {2,5,1,7,6};
//         insert(number);
//         display(number);
//     }
// }

//  selection sort 

// public class sort{
//     public static void select(int number[]){
//         for(int i=0; i<number.length-1;i++){
//             int minp = i;
//             for(int j = i+1; j<number.length;j++){
//                 if(number[minp]>number[j]){
//                     minp =j;
//                 }
//             }
//             //  swap;
//             int temp = number[minp];
//             number[minp] = number[i];
//             number[i] = temp;
//         }
       
//     }
//     public static void display(int number[]){
//         for(int i = 0; i<number.length;i++){
//             System.out.print(number[i]+ " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int number [] = {5,8,1,9,4,7,3};
//         select(number);
//         display(number);
//     }
// }

// //  bubble sort 
public class sort{
    public static void bubb(int number[]){
        for(int turn = 0; turn<number.length-1;turn++){
            for(int j=0; j<number.length-1-turn;j++){
                if(number[j]>number[j+1]){
                    // swap
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }
    }
    public static void display(int number[]){
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int number[]= {4,2,7,1,5,3};
        bubb(number);
        display(number);
    }
}