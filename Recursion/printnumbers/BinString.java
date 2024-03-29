public class BinString {
    public static void print(int n,int lp, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        // work
        print(n-1, 0, str+"0");
        if(lp == 0){
            print(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        print(3, 0, "");
    }
    
}
