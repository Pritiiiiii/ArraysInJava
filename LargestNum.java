public class LargestNum {
    public static void main(String[] args) {
        int [] a={6,8,23,5,10};
        int large=Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++){
if(a[i]>large){
    large=a[i];
}
    }
    System.out.println(large);
    
    
    
    }
}
