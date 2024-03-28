public class power {
    public static int pow(int p,int q){
        if(q==0){
            return 1;
        }
        int fn = pow(p,q-1);
        return p*fn;
    }
    public static void main(String[] args) {
        System.out.println(pow(2,10));
    }
}
