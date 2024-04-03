// push at the bottom of the stack    ====>  Amazon 
//  by recursion     

// REVERSE a stack...
import java.util.*;
public class push_bottom{
   public static void pushAtbottom(Stack<Integer> s,int x){
    if (s.isEmpty()) {
        s.push(x);
        return;
   }
   int top = s.pop();
   pushAtbottom(s, x);
   s.push(top);
}
public static void reverseStack(Stack<Integer> s){
    if(s.empty()){
        return;
    }
    int top = s.pop();
    reverseStack(s);
    pushAtbottom(s, top);
}
public static void print(Stack<Integer> s){
    while (!s.isEmpty()) {
        System.out.println(s.pop());
    }
}
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // pushAtbottom(s, 4);
        reverseStack(s);
        print(s);

        
    }
}