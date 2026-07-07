import java.util.Scanner;
public class MaxOneFrequency{
  static int FrequencyCounter(int n,int arr[]){
          int initial=0;
          int max=0;
       for(int p:arr){
           if(p==1){
                initial++;
               if(max<initial){
                   max=initial;
               }}else{
                   initial=0;
           }

       }
    return max;
  }
               
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
      int []arr=new int[n];
     for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
}

    System.out.print(FrequencyCounter(n,arr));
  }
}
