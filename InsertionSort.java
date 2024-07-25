public class InsertionSort {
    
    public static void main(String[] args) {
        int [] a= {29,4,15,7,54};
        for(int i=1; i < a.length;i++){
            int temp= a[i];//value store kiya
            int j= i;//here we store index
            while(j > 0 && a[j -1] > temp){
                a[j] = a[j-1];
                j--;

            }
            a[j]= temp;
        }
        for(int i=0; i < a.length;i++){
            System.out.print(a[i] + " ");
        }
    }

}
