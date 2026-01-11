import java.util.*;
public class UniqueElement{
  public static void mmain(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int [] arr =new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
    int unique=0;
    for(int num:arr){
        unique^=num;
    }
    System.out.println("Unique Element : "+unique);
  }
}
    
