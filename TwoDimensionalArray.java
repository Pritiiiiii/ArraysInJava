import java.util.Scanner;
public class TwoDimensionalArray {
/* public static void main(String[] args) {
        WAP TO PRINT ALL THE ELEMENTS PRESENT IN THE 2D ARRAY
        using literal array
        int[][]a={{1,2,3},{2,3,5,7},{10,20,30}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }
    }*/
    
    //using new keyword
    //DATATYPE [][]  VARIABLE=NEW[OUTER][INNER]
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of 2D array: ");
    int outer=sc.nextInt();
    System.out.println("Enter the size of 1D ARRAY");
    int inner=sc.nextInt();
    int [][]a=new int[outer][inner];
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            System.out.println("enter element for index"+i+ "" +j);

        }
    }
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
System.out.println(a[i][j]);
        }
    }
}
}