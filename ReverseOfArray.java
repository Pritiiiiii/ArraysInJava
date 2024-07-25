import java.util.Scanner;
public class ReverseOfArray {
    // public static void main(String[] args) {
    //     int[] arr = {58, 43, 16, 72, 69};
    //     for (int i = 0; i < arr.length; i++) {
    //         int reversedNumber = 0;
    //         while (arr[i] != 0) {
    //             int digit = arr[i]% 10;
    //             reversedNumber = reversedNumber * 10 + digit;
    //             arr[i] = arr[i] / 10;
    //         }
    //      System.out.print(reversedNumber +" ");
    //     }
        
        
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int values[]=new int[size];
        
        for(int i=0;i<values.length;i++){
            System.out.println(i);
            values[i]=sc.nextInt();
        }for(int i=0;i<values.length;i++){
            int reversedNumber=0;
            while (values[i]!=0) {
                int digit=values[i]%10;
                reversedNumber=reversedNumber*10+digit;
                values[i]=values[i]/10;
            }
            System.out.print(reversedNumber+" ");
        }
    }
}


