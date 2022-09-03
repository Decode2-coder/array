import java.util.Arrays;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class cyclicArr {
    static int arr[] = new int[]{1,2,3,4,5};
    static void rotate(){
        int x = arr[arr.length - 1],i;
        for(i=arr.length-1; i>0 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0]=x;
        
    }
    public static void main(String[] args){
        System.out.println("given array is: ");
        System.out.println(Arrays.toString(arr));
        rotate();
        System.out.println("rotated array is: ");
        System.out.println(Arrays.toString(arr));
    }

}
