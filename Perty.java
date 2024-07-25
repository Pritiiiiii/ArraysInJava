public class Perty {
    public static void main(String[] args) {
        int[]arr={12,45,30,90,50};
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            int j=i;
            while( j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
    }
    
}
