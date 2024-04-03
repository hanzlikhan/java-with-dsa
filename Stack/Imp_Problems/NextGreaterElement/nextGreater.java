import java.util.*;
public class nextGreater{
    public static void main(String[] args){
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int NextGrtr[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            while (!s.isEmpty() && s.peek()<= arr[i] ) {
                s.pop();
            }
            if (s.isEmpty()) {
                NextGrtr[i] = -1;
            }else{
                NextGrtr[i] = arr[s.peek()];
            }

            s.push(i);
        } 
        for(int i = 0;i<arr.length;i++){
            System.out.println("next greater :"+ NextGrtr[i]+" ");
        }
    }
}