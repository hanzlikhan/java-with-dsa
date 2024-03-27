public class fibonacci {
    public static int fib(int n){
        // base case 
        if(n==0) return 0;
        if(n==1) return 1;
        // Assumption
        int fib1 = fib(n-1);
        int fib2 = fib(n-2);
        int fibn = fib1 + fib2;
        return fibn;
    }
 public static void main(String[] args) {
    System.out.println(fib(6));
 }   
}
