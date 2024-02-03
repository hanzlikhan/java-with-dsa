// Question No 04:   Water level 
public class waterlevel {
        public static void water(int height[]){
            int n = height.length;
            // calculate left boundary
            int leftmax[] = new int[n];
            leftmax[0] = height[0];
            for(int i = 1; i<n;i++){
                leftmax[i] = Math.max( height[i],leftmax[i-1]);
            }
            // calculate rightmax 
            int rightmax[] = new int[n];
            rightmax[n-1] = height[n-1];
            for(int i=n-2; i>=0;i--){
                rightmax[i] = Math.max( height[i],rightmax[i+1]);
            }
            // loop 
            int trap = 0;
            for(int i=0;i<n;i++){
                int waterfall = Math.max(leftmax[i], rightmax[i]);
                trap += waterfall-height[i];
            }
            System.out.print("maximum traped water is " + trap);
        }
    public static void main(String args[]){
        int number[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        water(number);
    }
}
//  Question No 03:
// public class waterlevel {
//     public static void stock(int prices[]) {
//         int buy = Integer.MAX_VALUE;
//         // int profit = 0;
//         int maxprofit = 0; // Declare maxprofit outside the loop
//         for (int i = 0; i < prices.length; i++) {
//             if (buy < prices[i]) {
//                 maxprofit = Math.max(maxprofit, prices[i] - buy); // Update maxprofit directly
//             } else {
//                 buy = prices[i];
//             }
//         }
//         System.out.print("maximum price is " + maxprofit);
//     }

//     public static void main(String arg[]) {
//         int price[] = {72, 82, 58, 81, 46};
//         stock(price);
//     }
// }

// public class waterlevel{
//     // DSA # 22 find waterfall 
//     public static int water(int height[]){
//         // int n = height.length;
//         // // calculate leftmax boundary
//         // int leftmax[] = new int[n];
//         // leftmax[0] = height[0];
//         // for(int i=1;i<n;i++){
//         //     leftmax[i] = Math.max(height[i],leftmax[i-1]);
//         // }
//         int n = height.length;
//         int leftmax[] = new int[n];
//         leftmax[0] = height[0];
//         for(int i=1;i<n;i++){
//             leftmax[i] = Math.max(height[i], leftmax[i-1]);
//         }
//         // calculate rightmax boundary
//         int rightmax[] = new int[n];
//         rightmax[n-1] = height[n-1];
//         for(int i=n-2;i>=0;i--){
//             rightmax[i] = Math.max(rightmax[i+1], height[i]); 
//         }
//         // int rightmax[] = new int[n];
//         // rightmax[n-1] = height[n-1];
//         // for(int i=n-2;i>=0;i--){
//         //     rightmax[i] = Math.max(height[i], rightmax[i+1]);
//         // }
//         // loop 
//         int trapwater = 0;
//         for(int i=0;i<n;i++){
//             int waterlevel = Math.min(rightmax[i], leftmax[i]);
//             trapwater += waterlevel - height[i];
//         }
//         return trapwater;
//     }
//     public static void main(String args[]){
//         int height[] = {4,2,0,6,3,2,5};
//         int trappedwater = water(height);
//         System.out.println(trappedwater);
//     }
// }