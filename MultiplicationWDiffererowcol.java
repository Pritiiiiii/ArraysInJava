public class MultiplicationWDiffererowcol {
    public static void main(String[] args) {
        int [][] a={{1,2,3},{4,5,6}};
        int [][] b={{1,10},{0,1,0},{0,0,1}};
        matrix_Multiplication(a.length,a[0].length,a,b.length,b[0].length,b );
    }
  public static void matrix_Multiplication(int rowA,int colA,int[][] a,int rowB,int colB,int[][]b){
    //if the no. of cols in A is equals to no. of rows in B
    if(colA!=rowB){
        System.out.println("Matrix Multiplication is not possible");
        return;
    }
    int[][] c=new int[rowA][colB];
    for(int i=0;i<rowA;i++){
        for(int j=0;j<colB;j++){
for(int k=0;k<rowB;k++){
    c[i][j]=c[i][j]+(a[i][k]*b[k][j]); 
}
        }
    }
    for(int i=0;i<c.length;i++){
for(int j=0;j<c.length;j++){
    System.out.print(c[i][j]+" ");
}
System.out.println();
    }
  }
}
