import java.util.*;
public class LinearSearch{
public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int []arr=new int[n];
  for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
   }
System.out.println("Enter the Element to Search :");
int searchElement=sc.nextInt();
for(int j=0;j<n;j++){
    if(searchElement==arr[i])
        System.out.println("Element "+arr[i]+" found at index : "+i);       
   }
  }
}
