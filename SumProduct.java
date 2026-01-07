import java.util.Scanner;
public class SumProduct{
public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Size of Array: ");
     int n=sc.nextInt();
     int sum=0,product=1;
     int [] arr=new int[n];
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
    for(int i=0;i<n;i++){
       sum+=arr[i];
       product*=arr[i];
     }
    System.out.println("Sum of the Array : "+sum);
    System.out.println("Product of the Array : "+product);
}
}
