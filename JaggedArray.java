import java.util.Scanner;
public class JaggedArray {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the 2D array size: ");  
     int outer=sc.nextInt();
     int[][]a=new int[outer][];
for(int i=0;i<a.length;i++){
    System.out.println("Enter the 1D Array size for index" +i);
    int inner=sc.nextInt();
    a[i]=new int[inner];
    for(int j=0;j<a[i].length;j++){
        a[i][j]=sc.nextInt();
    }
    
}

    }
   
}
