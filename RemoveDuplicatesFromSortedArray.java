import java.util.*;
public class  RemoveDuplicatesFromSortedArray {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        Set<Integer> s = new LinkedHashSet<>();
        
        for (int i : arr) {
            s.add(i);
        }
        return new ArrayList<>(s);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        RemoveDuplicatesFromSortedArray remove=new RemoveDuplicatesFromSortedArray ();
        System.out.println(remove.removeDuplicates(arr));
    }
}
