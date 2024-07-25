import java.util.Scanner;
public class Program1 {
//     public static void main(String[] args) {
//     int []arr={3,7557,343,456};
// int k=5;
// int maxcount=0;
// int res=0;
// for(int i=0;i<arr.length;i++){
// int count=countOfDigit(arr[i], k);
// if(count>maxcount){
//     maxcount=count;
//     res=arr[i];
// }
// }
// System.out.println(res);       
//     }
//     public static int countOfDigit(int n,int k){
//         int count=0;
//         while (n!=0) {
//             int digit=n%10;
//             if(digit==k){
//                 count++;
//             }
// n=n/10;
//         }
//         return count;
//     }
public static void main(String[] args) {
    int[]arr={390,22342,5622,129};
    int maxcount=0;
    int res=0;
int k=2;
for(int i=0;i<arr.length;i++){
    int count=countOfDigit(arr[i],k);
    if(count>maxcount){
maxcount=count;
res=arr[i];
    }
}
System.out.println(res);
}
public static int countOfDigit(int n,int k){
int count=0;
while(n!=0){
    int digit=n%10;
    if(digit==k){
        count++;
    }
    n=n/10;
}
return count;
}

}
