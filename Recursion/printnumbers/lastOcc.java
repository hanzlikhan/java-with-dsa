public class lastOcc {
    public static int lstOc(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        int isFound = lstOc(arr, key, i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {3,8,2,9,8,7};
        System.out.println(lstOc(arr, 8, 0));
    }
    
}
