public class tiling_prob {
    public static int til(int n){
        if (n==0 || n==1) {
            return 1;
        }
        // vertical
        int fmn1 = til(n-1);
        // horizontal
        int fmn2 = til(n-2);
        int no_ways = fmn1 + fmn2;
        return no_ways;
    }
    public static void main(String[] args) {
        System.out.println(til(5));
    }
}
