import java.util.Scanner;
public class Variable{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)){
            // float rad = sc.nextFloat();
            // float pi = 3.14f;
            // System.out.print(rad*pi);
            // float rad = 257.22f;
            // int pi = (int)rad; // we cant convert simple float into int 
            // System.out.print(pi);   // value after point value will lost
            
            // byte a = 5;
            // byte b =(byte)(a*2);    // because a multiply with int and int cant store in byt due to loss of data
            // System.out.print(b);

            // operators
            // pre increment
            // int  a = 10;
            // int b = ++a;
            // System.out.println(a);
            // System.out.println(b);
            
            // post increment 
            // int a = 10;
            // int b = a++;
            // System.out.println(a);
            // System.out.println(b);

            // same rule apply on the decrement operators as increment 
            // int age = 18;
            // if(age >=20){
            //     System.out.print("adult can drive , vote caste and go to college");
            // }
            // if(age>=13 && age<=18){
            //     System.out.print("teenager");
            // }
            // else{
            //     System.out.print("child");
            // }
            // int a = 1;
            // int b = 2;
            // if(a>b){
            //     System.out.print("a is larger");
            // }
            // else{
            //     System.out.print("b is larger");
            // }

            // int a = sc.nextInt();
            // if(a%2==0){
            //     System.out.print( "is even");
            // }
            // else{
            //     System.out.print("ODD");
            // }
            //     int tax;
            // int income = sc.nextInt();
            // if(income < 500000 ){
            //     tax = 0;
            //     System.out.print("your tax is:"+ tax);
            // }
            // else if(income>500000 && income < 100000){
            //     tax = income/100 *20;
            //     System.out.print("your tax is:"+ tax);
            // }
            // else {
            //     tax = income/100*30;
            //     System.out.print("your tax is:"+ tax);
            // }

            // ternary operator

            // int marks = sc.nextInt();
            // String type = ((marks>33)? "pass": "fail");
            // System.out.print(type);
            
            // switch
            // int a = sc.nextInt();
            // int b = sc.nextInt();
            // char operator = sc.next().charAt(0);
            // switch (operator) {
            //     case '+': System.out.print(a+b);
            //     break;
            //     case '-': System.out.print(a-b);
            //     break;
            //     case '*': System.out.print(a*b);
            //     break;
            //     case '/': System.out.print(a/b);
            //     break;
            //     case '%': System.out.print(a%b);
            //     break;
            //     default:
            //     System.out.print("not a valid operator");
                     
                    
                 
            // }

            // loops 
            // while 
            // int a= 1;
            // while(a<=10){
            //     System.out.println(a);
            //     a++;
            // }
            // int a= 1;
            // int sum = 0;
            // while(a<=10){
            //     sum = sum+a;    
            //     a++;
            // }
            // System.out.print(sum);

            // for loop 
        //     int i = 1;
        //    int sum = 0;
        //     for (i=1;i<=10;i++){
        //         sum = sum+i;
        //     }
        //     System.out.print(sum);
            // for(int i=1; i<=5;i++){
            //         System.out.println("****");
            //     }
            
            // print reverse of a number;

            // ==> for get lastv digit     n%10    and remove last digit n/10
        // int n = 10899;
        // while(n>0){
        //     int ld = n%10;
        //     System.out.print(ld);
        //     n= n/10;
        // }
        // System.out.println();

        //  reverse a given number

        // int n = 89625;
        // int rev =0;
        // while(n>0){
        //     int ld = n%10;
        //     rev = (rev*10)+ld;
        //     n=n/10;
        // }
        // System.out.print(rev);

        //  do while 
        // do{
        // System.out.print("Enter your number:");
        // int i = sc.nextInt();
        
        //     if(i%10==0){
        //         break;
        //     }
        //     System.out.print(i);
        // }while(true);
        // int a = sc.nextInt();
        // double a = 103.25;
        // if(a>100){
        //     System.out.print("you have a fever");
        // }
        // else{
        //     System.out.print("you do not have a fever");
        // }
        // System.out.println("enter a day number");
        // int day = sc.nextInt();
        // switch (day) {
        //     case 1: System.out.print("Monday");  
        //         break;
        //         case 2: System.out.print("Tuesday");  
        //         break;
        //         case 3: System.out.print("Wednesday");  
        //         break;
        //         case 4: System.out.print("thursday");  
        //         break;
        //         case 5: System.out.print("friday");  
        //         break;
        //         case 6: System.out.print("saturday");  
        //         break;
        //         case 7: System.out.print("sunday");  
        //         break;
            
        //     default:
        //         System.out.println("invalid number");
        // }
//         int a = 63, b = 36;
// boolean x = (a < b ) ? true : false;
// int y= (a > b ) ? a : b;
// System.out.print(x);
// System.out.print(y);
// System.out.print("Enter a year");
// int year = sc.nextInt();
// boolean x = (year % 100 != 0);
// boolean y = (year % 4 == 0);
// boolean z = ((year % 100 == 0) && (year % 400 == 0));
// if(y &&(x || z)){
//     System.out.print("this year is a leap year");
// }
// else{
//     System.out.print("this year is not a leap year");
// }
// int sume = 0;
// int sumo = 0;
// for(int i = 0; i<20; i++){
//     if(i%2==0){
//         System.out.println("even number is :"+ i);
//         sume = sume+i;
//     }
//     else {
//         System.out.println("odd number is :"+ i);
//         sumo = sumo+i;
//     }
// }
// System.out.println("sum of all even numbers is :" + sume);
// System.out.println("sum of all odd numbers is :" + sumo);

//   factorial 

// int fact = 1;
// System.out.print("enter a number");
// int num = sc.nextInt();
// for(int i = 1; i<num; i++){
//     fact *= i;
// }
// System.out.print(fact);
// System.out.print("Enter a number");
// int num = sc.nextInt();
// for(int i = 1; i<=num; i++){
//     System.out.println(num +"*"+ i +"=" + num*i);
// }
// for(int i = 0; i <= 5; i++ ) {
//     System.out.println("i = " + i );
//     }

// do {
//     System.out.println("Enter a number");
//     int num = sc.nextInt();
//     if(num%10==0){
//         continue;
//     }
//     else{
//         System.out.print("number was :" + num);
//     }
// } while (true);
    
// prime number 
// int num = sc.nextInt();
// boolean isprime = true;
// for(int i = 2 ; i<=num-1; i++){
//     if(num%i == 0){
//         isprime = false;
//     }
// }
// if(isprime == true){
//     System.out.print("number is prime number");
// }
// else{
//     System.out.print("number is not a prime number");
// }

//    pattern 

// for(int i=1; i<=4;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// int n=4;
//     for(int i= 1 ; i<=n; i++){
//         for(int j = 1; j<=(n-i+1); j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }

//   int n=4;
//   for(int i = 1; i<=n; i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(j);
//     }
//     System.out.println();
//   }

 int n=4;
 char ch = 'A';
  for(int i=1; i<=n; i++){
    for(int j=1;j<=i;j++){
        System.out.print(ch);
        ch++;
    }
    System.out.println();
  } 
        }
    }
}
