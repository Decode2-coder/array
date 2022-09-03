public class maxmin{
    public static void main(String[] args){
        int arr[] = {3,5,6,2,7,8,10};
        maxmin obj = new maxmin();
        obj.findmax(arr);
        obj.findmin(arr);


    }
    public void findmax(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];

            }
        }
        System.out.println(max);
    }
    public void findmin(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];

            }
        }
        System.out.println(min);

    }
}