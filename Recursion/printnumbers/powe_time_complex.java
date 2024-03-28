public class powe_time_complex {
    public static int pow(int p,int q){
        if (q==0) {
            return 1;
        }
        int fmn1 = pow(p,q/2);
        int optimized = fmn1 * fmn1;
        if(q%2 !=0){
            optimized = p * optimized;
        }
        return optimized;
    }
    public static void main(String[] args) {
        System.out.println(pow(2,10));
    }
    
}
