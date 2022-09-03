class jumpGame {
    public void int canJump(int[] arr){
        // int[] arr = {2,3,1,1,4};
        int lastGoodIndexPosition = arr.length - 1;
        for(int i = arr.length - 1; i>=0; i--){
            if(i+arr[i] >= lastGoodIndexPosition){
                lastGoodIndexPosition = i;
            }
        }
        System.out.println(lastGoodIndexPosition);;
        // return lastGoodIndexPosition = 0;

    }
    public static void main(String[] args){
        int[] arr =  {3, 5, 10, 15, 17, 12, 9};
        jumpGame j = new jumpGame();
        j.canJump(arr);
    }
    

    
    
    
}
