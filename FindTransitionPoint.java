import java.util.*;
public class FindTransitionPoint {
    int transitionPoint(int arr[]) {
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)
                return i;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        FindTransitionPoint ftp=new FindTransitionPoint();
        System.out.println(ftp.transitionPoint(arr));
    }
}
