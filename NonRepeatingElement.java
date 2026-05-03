import java.util.*;
public class NonRepeatingElement {
     int firstNonRepeating(int[] arr) {
        
        Map<Integer,Integer> m = new HashMap<>();
        for (int i : arr) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        for (int i : arr) {
            if (m.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        NonRepeatingElement non=new NonRepeatingElement();
        System.out.println(non.firstNonRepeating(arr));
        
    }
}
