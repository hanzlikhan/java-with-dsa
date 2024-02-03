public class array{
  
    // max array sum by kadanes
    // public static void sum(int num[]){
    //     int cs = 0;
    //     int ms = Integer.MIN_VALUE;
    //     for(int i=0;i<num.length;i++){
    //         cs += num[i];
    //         if(cs<0){
    //             cs = 0;
    //         }
    //         ms= Math.max(cs, ms);
    //     }
    //     System.out.println(ms);
    // }
    //  find max array sum by prefix array 

    // public static void sum(int num[]){
    //     int curr_sum=0;
    //     int max_sum = Integer.MIN_VALUE;
    //     int prefix[] = new int[num.length];
    //     for(int i=1;i<prefix.length;i++){
    //         prefix[i] = prefix[i-1] + num[i];
    //     }
    //     for(int i=0;i<num.length;i++){
    //         int start = i;
    //         for(int j=i;j<num.length;j++){
    //             int end = j;
    //             curr_sum = start==0 ? prefix[end] :prefix[end]-prefix[start-1];
    //             if(max_sum<curr_sum){
    //                 max_sum=curr_sum;
    //             }
    //         }
    //     }
    //     System.out.println("max srray sum is " + max_sum);
    // }
    //  max subarray sum
    // public static void pair(int num[]){
    //     int curr_sum = 0;
    //     int max_sum = Integer.MIN_VALUE;
    //     for(int i=0;i<num.length;i++){
    //         int start = i;
    //         for(int j=i;j<num.length;j++){
    //             int end = j;
    //             for(int k=start;k<=end;k++){
    //                 curr_sum += num[k];
    //             }
    //             System.out.println(curr_sum);
    //             if(max_sum<curr_sum){
    //                 max_sum = curr_sum;
    //             }

    //         }
    //     }
    //     System.out.println("maximum sum in sub array is " + max_sum);
    // } 
    //  subarrays
//     public static void pair(int num[]){
//         int ts =0;
//     for(int i=0;i<num.length;i++){
//         int start = i;
//         for(int j=i;j<num.length;j++){
//             int end = j;
//             for(int k=start; k<=end;k++){
//                 System.out.print(num[k] + " ");
//             }
//             ts++;
//             System.out.println();
//         }
//         System.out.println();
//     }
//     System.out.println("total number of pair is " + ts);
// }
    //  make pair in array 
    // public static void pair(int num[]){
    //     for(int i=0;i<num.length;i++){
    //         int curr = num[i];
    //         for(int j=i+1;j<num.length; j++){
    //             System.out.print("( " + curr + "," + num[j] + ")" );
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void pair(int num[]){
    //     for(int i=0;i<num.length;i++){
    //         int curr = num[i];
    //         for(int j=i+1;j<num.length;j++){
    //             System.out.print("("+curr +","+ num[j]+ ")");
    //         }
    //         System.out.println();
    //     }
    // }


    
//  reverse an array 
// public static void pat(int number[]){
//  int first = 0;
//  int last = number.length-1;
//  while (first<last) {
//     int temp = number[last];
//     number[last] = number[first];
//     number[first] = temp;
//     first++;
//     last--;
//  }
// }
    // find key by binary search

    // public static int search(int num[],int key){
    //     int start = 0;
    //     int end = num.length-1;
    //     while(start<=end){
    //         int mid = start+end/2;
    //         if(num[mid]==key){
    //             return mid;
    //         }
    //         if(num[mid]<key){
    //             start = mid+1;
    //         }
    //         if(num[mid]>key){
    //             end = mid-1;
    //         }
    //     } 
    //     return -1;
    // }

    //  find largest
    // public static int larger(int num[]){
    //     int lrg = Integer.MIN_VALUE;
    //     int smal = Integer.MAX_VALUE;
    //     for(int i = 0; i<num.length;i++){
    //         if(lrg < num[i]){
    //             lrg=num[i];
    //         }
    //         if (smal>num[i]) {
    //             smal = num[i];
    //         }

            
    //     }
    //     System.out.println("smallest number is "+ smal);
    //     return lrg;
    // }
    // public static void update(int marks[]){
    //     for(int i=0; i<marks.length; i++){
    //         marks[i]= marks[i]+1;
    //     }

    // }

    //  linear search

    // public static int search(int num[],int key){
    //     for(int i=0;i<num.length;i++){
    //         if(num[i]==key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    public static void main(String args[]){
        // int marks[] = {37,72,52};
        // update(marks);
        // for(int i=0;i<marks.length;i++){
        //     System.out.print(marks[i]+ " ");
        // }
        // System.out.println();
        //  simple input in the array
        // int marks[] =new int[100];
        // marks[0]= 93;
        // marks[1]= 72;
        // marks[2]= 67;
        // System.out.println("marks of sub1 is :" + marks[0]);
        // System.out.println("marks of sub2 is :" + marks[1]);
        // System.out.println("marks of sub3 is :" + marks[2]);
        // System.out.print("length of the rray is :"+ marks.length);

        // function
        //  parameter pass by reference

       
        //  linear search

        // int number[] = {12,32,12,53,54,12,54,36,63};
        // int key = 32;
        // int index =search(number, key);
        // if(index == -1){
        //     System.out.print("key not found in array");
        // }
        // else{
        //     System.out.print("key is found at index :" + index);
        // }

        // find the largest

        // int number[] = {12,74,78,89,35,989};
        // int large = larger(number);
        // System.out.print("largest number is " + large);

        // binary search and find the key in an array

    //     int number[] = {38,78,97,112,576,723,924,1026,2467,8726};
    //     pat(number);
    //     for(int i=0;i<number.length;i++){
    //         System.out.println(number[i]);
    //     }
    //     System.out.println();
    // }
    int number[]= {-2,-3,4,-1,-2,1,5,-3};
    sum(number);

    }
}