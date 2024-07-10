public class ReverseOfArray {
    public static void main(String[] args) {
        int[] arr = {58, 43, 16, 72, 69};
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            int reversedNumber = 0;
            while (arr[i] != 0) {
                int digit = arr[i]% 10;
                reversedNumber = reversedNumber * 10 + digit;
                arr[i] = arr[i] / 10;
            }
         System.out.print(reversedNumber +" ");
        }
        
        
    }
}
