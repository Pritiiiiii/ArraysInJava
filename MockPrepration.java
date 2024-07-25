import java.util.Scanner;
public class MockPrepration {
    //Bubble sort
    /*
     *  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int []values=new int[size];
    for(int i=0;i<values.length;i++){
values[i]=sc.nextInt();
    }
    printArray(values);
    bubbleSort(values);
    printArray(values);
    }
    public static void bubbleSort(int num[]){
for(int i=0;i<num.length;i++){
    for(int j=0;j<num.length-1;j++){
        if(num[j]>num[j+1]){
            int temp=num[j];
            num [j]=num [j+1];
            num[j+1]=temp;
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
     */

     //Insertion sort

//    public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//     int size=sc.nextInt();
//     int []values=new int[size];
//     for(int i=0;i<values.length;i++){
// values[i]=sc.nextInt();
//     }
//     for(int i=0;i<values.length;i++){
//         int temp=values[i];
//         int j=i;
//         while(j>0 && values[j-1]>temp){
//             values[j]=values[j-1];
//             j--;
//         }
//         values[j]=temp;
        
//     }
//     for(int i=0;i<values.length;i++){
//         System.out.println(values[i]+" ");
//     }
//     System.out.println();

// }
/*public static void main(String[] args) {
    int []arr={100,89,30,20,70,80,200};
for(int i=0;i<arr.length;i++){
    int temp=arr[i];
    int j=i;
    while(j>0 && arr[j-1]>temp){
        arr[j]=arr[j-1];
        j--;
    }
    arr[j]=temp;
}
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]+" ");
}
System.out.println();
} */

//SELECTION SORT
public static void main(String[] args) {
    int[] arr={10,89,90,45,20};
    for(int i=0;i<arr.length;i++){
        int min=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
    }
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]+" ");
}
System.out.println();
}
}
    



