import java.util.Scanner;
public class SecondLargeNum {
    // public static void main(String[] args) {
    //     int num[]={6,18,23,18,23,12,18,17,3025,10};
    //     int secondLarge=Integer.MIN_VALUE; 
    //     int large=Integer.MIN_VALUE;
    //     for(int i=0;i<num.length;i++){
    //        if(num[i]>large){
    //         secondLarge=large;
    //         large=num[i];
    //        } 
    //        else if(num[i]>secondLarge && num[i]!=large){
    //         secondLarge=num[i];
    //        }
           
    //     }
    //     System.out.println("The largest NUmber is" +" " +  large);
    //     System.out.println("The Second Largest NUmber" +" "+  secondLarge);
       
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int large=Integer.MIN_VALUE;
       int slarge=Integer.MIN_VALUE;
        int[]values=new int[size];
        for(int i=0;i<values.length;i++){
            values[i]=sc.nextInt();
        }
        for(int i=0;i<values.length;i++){
if(values[i]>large){
    slarge=large; 
    large=values[i];
}else if(values[i]!=large && values[i]>slarge){
    slarge=values[i];
}
        }
        System.out.println(slarge);
    }
}
