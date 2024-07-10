public class ProductOfOdd {
    public static void main(String[] args) {
        int [] num={2,5,1,7,8,9,10};
        for(int i=0;i<num.length;i++){
            if(num[i]%2!=0){
                System.out.print(num[i] +" ");
            }
        }
    }
}
