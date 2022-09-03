import javax.swing.plaf.synth.SynthSpinnerUI;

public class moveNegToBeg {
    public static void main(String[] args){
        int[] arr= {-7,-4,3,-2,6,7,4,42,0};
        
        rearrage(arr);
        printArr(arr);

    }
    public static void rearrage(int[] arr){
        int j=0; int temp = 0;
        for(int i=0; i<arr.length ; i++){
            if(arr[i]<0){
                if(i!=j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }


        }
    }
    public static void printArr(int[] arr){
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
