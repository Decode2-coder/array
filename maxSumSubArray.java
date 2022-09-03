public class maxSumSubArray {
    //KADANE'S ALGO
    public static void main(String[] args){
        int arr[] = {1, 3, 8, -2, 6, -8, 5};
        System.out.println(maximumSum(arr));

    }
    static int maximumSum(int[] arr){
        int maxSum = 0;
        int currSum = 0;
        for(int i=0;i<arr.length; i++){
            currSum = currSum + arr[i];

            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
            }

        
        }
        return maxSum;

    }
    
}
