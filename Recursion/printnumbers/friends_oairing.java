public class friends_oairing {
    public static int pairing(int n){
        int fmn1 = pairing(n-1);
        int fmn2 = pairing(n-2);
        int ways = (n-1) * fmn2;
        int totalways = fmn1 + ways;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(pairing(3));
    }

}
