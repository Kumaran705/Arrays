 import java.util.*;
public class ZeroLeftShifting{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the Array: ");
      int n=sc.nextInt();
      int [] arr=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      for(int i=0;i<n/2;i++){
        for(int j=arr.length-1;j>=n/2;j--){
            if(arr[i]!=0&&arr[j]==0){
               int temp=arr[i];
               arr[i]=arr[j];
              arr[j]=temp;
            }
        }
      }
      System.out.println(Arrays.toString(arr));
    }
}
