import java.util.*;
public class ArraySortCheck{
  boolean isSort(int []arr){
          for(int i=0;i<arr.length-1;i++){
           if(arr[i]>arr[i+1])
                  return false;
          }
         return true;
}
  public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int [] arr=new int[n];
           for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
            }
           ArraySortCheck a=new ArraySortCheck();
           System.out.println(a.isSort(arr));
         
  }
}
