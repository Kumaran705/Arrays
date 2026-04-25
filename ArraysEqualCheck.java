import java.util.*;
public class  ArraysEqualCheck {
    private static boolean checkEqual(int[] a, int[] b) {
        if(a.length !=b.length)
            return false;
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
        
    }
   public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Size of the First Array: ");
            int n=sc.nextInt();
            int []arr1=new int [n];
            for(int i=0;i<n;i++){
                     arr1[i]=sc.nextInt();
              }
           System.out.println("Enter the Size of the Second Array: ");
            int m=sc.nextInt();
            int []arr2=new int [m];
            for(int j=0;j<m;j++){
                     arr2[j]=sc.nextInt();
              }
           System.out.println(checkEqual(arr1,arr2));
           
 
           
}




















