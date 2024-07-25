import java.util.Scanner;
public class Program {
    //  public static void main(String[] args) {
    //     int []arr={8,7,4,3,5,2};
    //     for(int i=0;i<arr.length;i++){
    //         boolean isLeader=true;
    // for(int j=i+1;j<arr.length;j++){
    //     if(arr[j]>arr[i]){
    //        isLeader=false;
    //        break;  
    //     }
    // }
    // if(isLeader){
    //     System.out.print(arr[i]+" ");
    // }
    //     }
    
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] values=new int[size];
        for(int i=0;i<values.length;i++){
            // System.out.println(i);
            values[i]=sc.nextInt();
        }
        for(int i=0;i<values.length;i++){
            boolean isLeader=true;
            for(int j=i+1;j<values.length;j++){
                if(values[j]>values[i]){
                    isLeader=false;
                }
            }
            if(isLeader){
                System.out.print(values[i] +" ");
            }
        }
    }
}
