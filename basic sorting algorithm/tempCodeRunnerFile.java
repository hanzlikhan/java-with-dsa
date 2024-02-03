public class sort{
    public static void bubb(int number[]){
        for(int turn = 0; turn<number.length-1;turn++){
            for(int j=0; j<number.length-1-turn;j++){
                if(number[j]>number[j+1]){
                    // swap
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }
    }
    public static void display(int number[]){
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int number[]= {4,2,7,1,5,3};
        bubb(number);
        display(number);
    }
}