import java.util.Arrays;
import java.util.Scanner;
public class SyntaxOfArray {
    //by using array literal we can create
//     public static void main(String[] args) {
//         int [] num={1,2,3,4,576,98};
// for(int i=0;i<num.length;i++)
//     {
// System.out.println(num[i]);
//     }
//     }

//taking input from the user
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the size of an array: ");
//     int Size=sc.nextInt();
//     int values[]=new int[Size];
    
//     for(int i=0;i<values.length;i++){
//         System.out.println("enter values for index i "+i);
//        values[i]=sc.nextInt();
        
//     }
//     for(int i=0;i<values.length;i++){
//         System.out.print(values[i] +" ");
//     }
    
// }
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int  []values=new int[size];
for(int i=0;i<values.length;i++){
    System.out.println(i);
    values[i]=sc.nextInt();
}for(int i=0;i<values.length;i++){
    System.out.println(values[i]);
}

}

}