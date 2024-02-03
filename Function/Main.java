import java.util.Scanner;
public class Main{
    // public static int sum(int a,int b){
    //     return a+b;
    // }
    // public static void swap(int num1, int num2){
    //     int temp = num1;
    //     num1=num2;
    //     num2=temp;
    //     System.out.print(num1);
    //     System.out.print(num2);
    // }

    //  factorial
    // public static int facto(int num){
    //     int fact = 1;
    //     for (int i=1;i<=num;i++){
    //         fact = fact*i;
    //     }
    //     return fact;
    // }
    // public static int factorials(int n, int r){
    //       int  fact_n= facto(n);
    //       int fact_r = facto(r);
    //       int fact_rn = facto(n-r);
    //       int bico = fact_n/(fact_r*fact_rn);
    //       return bico;
    // }
    // public static int bintodec(int num){
    //     int pow = 0;
    //     int dec = 0;
    //     while(num>0){
    //         int ld = num%10;
    //         dec = dec + (ld*(int)Math.pow(2, pow));
    //     pow++;
    //     num = num/10;
    //     }
    //     return dec;
    // }
    // public static int bintodec(int num){
    //     int pow = 0;
    //     int dec = 0;
    //     while(num>0){
    //         int ld = num%10;
    //         dec = dec +(ld * (int)Math.pow(2, pow));
    //         pow++;
    //         num /=num;
    //     }
    //     return dec;
    // }

    //  decimal to binary 
    // public static int dec(int num){
    //     int pow = 0;
    //     int bin = 0;
    //     while(num>0){
    //        int  rem = num%2;
    //         bin = bin +(rem* (int)Math.pow(10, pow));
    //         pow++;
    //         num = num/2;
    //     }
    //     return bin;
    // }

    
    public static void main(String args[]){
       try (Scanner sc = new Scanner(System.in)){
        // System.out.print("enter first number :");
        // int num1 = sc.nextInt();
        // System.out.print("enter 2nd number :");
        // int num2 = sc.nextInt();
        // System.out.println("sum is :" + sum(num1,num2));
        // int a = 5;
        // int b= 10;
        // swap(a,b);
        // System.out.print("Enter a number");
        // int num1 = sc.nextInt();
        // int factorial =factorials(5,2);
        // System.out.print(factorial);

        // System.out.print("binary to decimal is =" + bintodec(10001001));
        System.out.print(dec(7));
    }
    }
}