import java.util.Stack;

public class MaxArea{
    public static void  maxArea(int height[]) {
        int maxar = 0;
        int nsr[] =  new int[height.length];
        int nsl[] =  new int[height.length];
        //  Finding the number of smaller elements on left side
        Stack<Integer> s = new Stack<>();
        for(int i = 0;i<height.length;i++){
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // Finding the number of smaller elements on Right side
        s = new Stack<>();
        for(int i = height.length-1;i>=0;i--){
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = height.length;

            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // find cureent Area
        for(int i = 0;i<height.length;i++){
            int hei = height[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = hei * width;
            maxar = Math.max(maxar, currArea);
        }
        System.out.println(maxar);
    }
    public static void main(String[] args) {
        int height[] = {2,1,5,6,2,3};
        maxArea(height);
    }
}