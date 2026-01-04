public class MaxElement{
public static void main(String[] args) {
   int arr[]={1,2,3,4,5};
   int max=arr[0];
   for(int i:arr){
       if(max<i)
          max=i;
   }
    System.out.println("Maximum Element: "+max);
}
}
