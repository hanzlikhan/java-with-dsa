// public class pattern{

    //  hollow pattern
    // public static void pat(int rows,int col){
    //     for(int i = 1; i<=rows; i++){
    //         for(int j=1;j<=col; j++){
    //             if(i==1|| i==rows || j==1 || j==col){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    //  inverted half pyramid
    // public static void pat(int n){
    //     for(int i = 1; i<=n; i++){
    //         // spaces 
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // inveryed half pyramid with numbers
    // public static void pat(int num){
    //     for(int i=1; i<=num; i++){
    //         for(int j=1; j<=num-i+1; j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void pat(int num){
    //     for(int i=1;i<=num;i++){
    //         for(int j=1;j<=num-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1; j<=i;j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }

    //  Floyds pattern

    // public static void pat(int num){
    //     int counter = 1;
    //     for (int i = 1; i<=num; i++){
    //         for(int j=1; j<=i; j++){
    //             System.out.print(counter);
    //             counter++;
    //         }
    //         System.out.println();
    //     }
    // }

    //  triangle 010
    // public static void pat(int num){
    //     for(int i = 1; i<=num;i++){
    //         for(int j=1; j<=i;j++){
    //             if((i+j)%2==0){
    //                 System.out.print("1");
    //             }else{
    //                 System.out.print("0");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    //   butterfly pattern

    // public static void pat(int num){
    //     for(int i = 1;i<=num; i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         for(int j=1;j<=(2*(num-i));j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     for(int i = num;i>=1; i--){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         for(int j=1;j<=(2*(num-i));j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    //  Solid rohombus 
    // public static void pat(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1; j<=n;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    //  hollow rohombus
    // public static void pat(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1; j<=n;j++){
    //             if(i==1||i==n||j==1|| j==n){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // diamond pattern 

    // public static void pat(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1; j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=(2*i-1);j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     for(int i=n;i>=1;i--){
    //         for(int j=1; j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=(2*i-1);j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // diamond number 

    // public static void pat(int n){
    //     for(int i=1; i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print(i + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    // palindromic number 

//     public static void pat(int n){
//         for(int i = 1; i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=i; j>=1;j--){
//                 System.out.print(j);
//             }
//             for(int j=2; j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         pat(4);
//     }
// }

//    solid harrow diamond
// public class pattern{
//     public static void main(String args[]){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=i;j<=5;j++){
//                 System.out.print("*");
//             }
//             for(int k=1;k<=(i*2)-1;k++){
//                 System.out.print(" ");
//             }
//             for(int j=i;j<=5;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n;i>=1;i--){
//             for(int j=i;j<=5;j++){
//                 System.out.print("*");
//             }
//             for(int k=1;k<=(i*2)-1;k++){
//                 System.out.print(" ");
//             }
//             for(int j=i;j<=5;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
      
//     }
// }


//  fancy pattern

// public class pattern{
//       public static void main(String args[]){
//              int n=5;
//              for(int i=1;i<=n;i++){
//                 for(int j=1;j<=i;j++){
//                     if(j==1){
//                         System.out.print(i);
//                     }else{
//                         System.out.print("*"+ i);
//                     }
//                 }
//                 System.out.println();
//              }
//              for(int i=n;i>=1;i--){
//                 for(int j=1;j<=i;j++){
//                     if(j==1){
//                         System.out.print(i);
//                     }else{
//                         System.out.print("*"+ i);
//                     }
//                 }
//                 System.out.println();
//              }
//              }
//       }


// plaindrome alphabets

public class pattern {

    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            char ch = 'A';
            // for(int j=0;j<n-i-1;j++){
            //     System.out.print(" ");    
            // }
           for(int j=0;j<=i;j++){
            System.out.print(ch);
            ch++;
           }
           ch--;
           for(int j=i;j>0;j--){
            ch--;
            System.out.print(ch);
           }
           System.out.println();
        }
    }
}