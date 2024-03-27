public class factorial {
    public static int print(int n){
        if(n==0){
           return 1;
        }
        int fn = n * print(n-1);
        return fn;
    }
    public static void main(String[] args) {
        int n = 1;
        System.out.println(print(n));

    }
}
