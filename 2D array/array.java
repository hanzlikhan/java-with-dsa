// import java.util.*;
// public class array{

//     public static void main(String args[]) {
//         int matrix[][] = new int[3][3];
//         int n = matrix.length, m = matrix[0].length;
        
//                 try(Scanner sc = new Scanner(System.in)){
//                     for(int i=0;i<n;i++){
//                         for(int j=0;j<m;j++){
//                             matrix[i][j] = sc.nextInt();
//                 }

//             }
//         }
//         for(int i = 0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(matrix[i][j]+ " ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class array {
//     public static void spiral(int matrix[][]) {
//         if (matrix == null || matrix.length == 0) {
//             System.out.println("Empty matrix");
//             return;
//         }
//         int sr = 0;
//         int sc = 0;
//         int er = matrix.length - 1; // Corrected the index for the last row
//         int ec = matrix[0].length - 1; // Corrected the index for the last column
//         while (sr <= er && sc <= ec) {
//             // for top
//             for (int j = sc; j <= ec; j++) {
//                 System.out.print(matrix[sr][j] + " ");
//             }
//             // for right
//             for (int i = sr + 1; i <= er; i++) {
//                 System.out.print(matrix[i][ec] + " ");
//             }
//             // for bottom
//             for (int j = ec - 1; j >= sc; j--) {
//                 if (sr == er) {
//                     break;
//                 }
//                 System.out.print(matrix[er][j] + " ");
//             }
//             for (int i = er - 1; i > sr; i--) { // Corrected the condition
//                 if (sc == ec) {
//                     break;
//                 }
//                 System.out.print(matrix[i][sc] + " ");
//             }
//             sc++;
//             sr++;
//             ec--;
//             er--;
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int matrix[][] = {{1, 2, 3, 4},
//                           {5, 6, 7, 8},
//                           {9, 10, 11, 12},
//                           {13, 14, 15, 16}};
//         spiral(matrix);
//     }
// }

//  search sorted array
// 
//   print number of 7 
// public class array{
//     public static void main(String args[]){
        
//             int count = 0;
//             int matrix[][] = {{4,7,8},{8,8,7}};
//             for(int i=0; i<matrix.length;i++){
//                 for(int j= 0;j<matrix[0].length;j++){
//                     if(matrix[i][j]==7){
//                         count++;
//                     }
//                 }
//             }
//             System.out.print(count);
//         }
//     }

// print sum of second row 
// public class array{
//     public static void main(String args[]){
//         int matrix[][] = {{2,4,6},{7,6,5},{9,8,7}};
//         int sum =0;
//         for(int j=0;j<matrix.length;j++){
//             sum+=matrix[1][j];
//         }
//         System.out.print(sum);
//     }
// }

//  transpose the array 
public class array {
    public static void print(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int row = 2;
        int col = 3;
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}};
        print(matrix);
        //  transpose the matrix
        int transpose[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j]; // corrected index
            }
        }
        print(transpose);
    }
}
