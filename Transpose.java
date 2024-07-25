//WAP TO FIND THE TRANSPOSE OF MATRIX
public class Transpose {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
    // for(int i=0;i<arr.length;i++){
    //     for(int j=0;j<arr[i].length;j++){
    //         System.out.print(arr[j][i]+" ");
    //     }
    //     System.out.println();
    // }
    transpose(arr);
    }
    public static void transpose(int[][]a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}
