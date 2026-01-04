

public class MissingNo {
    
    public static void main(String[] args) {
        int []arr={1,3,4,5};
        int sum=0;
        int n=arr.length;
        int total=n*(n+1)/2;
      
        for(int i:arr){
            sum+=i;
        }
         System.out.println("Missing Number: "+(total-sum));
}
}