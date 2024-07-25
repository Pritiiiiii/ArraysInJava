public class Prctice {
//     public static void main(String[] args) {
//       int[] arr={12,65,100,65,100};
// int large=Integer.MIN_VALUE;//to store the large value
// for(int i=0;i<arr.length;i++){
//   if (large<arr[i]){
// large=arr[i];
//   }
// }
// System.out.println(large);

//     }
//to find  second largest number
// public static void main(String[] args) {
//     int[] num={10,23,50,70,90,90,100};
//     int large=Integer.MIN_VALUE;
//     int slarge=Integer.MIN_VALUE;
//     for(int i=0;i<num.length;i++){
//         if(num[i]>large){
//             slarge=large;
//             large=num[i];
            
//         }else if(num[i]>slarge && num[i]!=large){
//             slarge=num[i];
//         }
//     }
//     System.out.println(slarge);
// }

//Armstrong number
public static void main(String[] args) {
    System.out.println(countDigits(3254));
    
}
public static int pow(int n,int p){
    int prod=1;
    for(int i=0;i<=p;i++){
        prod*=i;
    }
    return prod;
}
public static int countDigits(int num){
     while (num!=0) {
int count=0;
count++;
    num=num/10;
    }
    return count;


}

}
