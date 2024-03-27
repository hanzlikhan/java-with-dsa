//  decimal to binary
public class bit{
    public static void main(String args[]){
        int n=10;
        int i=n;
        int count = 0;
        while (i>=0) {
            int rem = n%2;
            count++;
            n = n/10;
        }
    }
}