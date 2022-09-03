public class reverseArr {
    public static void main(String[] args){
        int[] intArray = {5,4,3,2,1};
        System.out.println("Original Array:");
        for(int i=0;i<intArray.length;i++)
        System.out.print(intArray[i] + "  ");
     
        System.out.println();

        System.out.println("Original Array printed in reverse order:");
         for(int i=intArray.length-1;i>=0;i--)
         System.out.print(intArray[i] + "  ");
    }    
}
