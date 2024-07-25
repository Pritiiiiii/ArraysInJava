import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] a=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Before Sorting");
        printArray(a);
        BubbleSort(a);
        System.out.println("After the sorting");
        printArray(a);
        
        
        
}
public static void BubbleSort(int[]a){
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length-1;j++){
            if(a[j]>a[j+1])
            {
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            } 
        } 
    }
    
}
public static void printArray(int[]a){
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
    System.out.println();
}
}