public class first_occ {
    public static int  frOcc(int[] arr, int key,int i){
        if (i >= arr.length) return -1;
        if(arr[i]==key){
            return i;
        }
        return frOcc(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(frOcc(arr, 3,0));
    }
    
}
