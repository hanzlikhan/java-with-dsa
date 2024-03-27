public class increasing_order {
    public static void print(int n){
        if(n==1){    // base case 
            System.out.println(n+" ");
            return;
        }
        print(n-1);
        System.out.println(n+"");
    }
    public static void main(String args[]){
        int n = 5;
        print(n);
    }
}
