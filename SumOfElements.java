import java.util.Scanner;
public class SumOfElements {
//     public static void main(String[] args) {
//         int[] nums={11,10,12,13,15};
// int sum=0;
// for(int i=0;i<nums.length;i++){
//     sum=sum+nums[i];
// }
// System.out.println(sum);
//     }
public static void main(String[] args) {
    int sum=0;
    Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int []values=new int[size];
for(int i=0;i<values.length;i++){
    System.out.println(i);
    values[i]=sc.nextInt();
sum+=values[i];
}

System.out.println(sum);
}



}
