import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
      try{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String s=br.readLine();
      String a[]=s.split(" ");
      int []arr=new int[a.length];
      for(int i=0;i<a.length;i++){
        arr[i]=Integer.parseInt(a[i]);
      }
      int i=0;
      int j=0,k=arr.length-1;
      while(j<arr.length){
        if(arr[j]!=0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            }
        j++;
          
      }
      for(int x:arr){
        System.out.print(x+" ");
      }
      }catch(Exception e){
        System.out.print(e);
      }
    }
}
