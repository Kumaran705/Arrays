import java.util.*;
public class SmallestElement{
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
int n=sc.nextInt();      
int []arr=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
int min=arr[0];
for(int j:arr){
   if(j<min){
        min=j;
    }
}
System.out.println("Smallest Element in the Array is "+min);
}
}
