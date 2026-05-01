public class SwapArrayElement {
    void swapElements(int[] arr) {
        for(int i=0;i<arr.length-2;i++){
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    SwapArrayElement swap=new SwapArrayElement();
    swap.swapElements(arr);
    }
}
