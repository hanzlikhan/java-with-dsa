public class sum_of_n {
    public static int sum(int n){
        if (n==1) return 1;
       int su = n + sum(n-1);
        return su;

    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
