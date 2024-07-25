import java.util.Scanner;
// wap to find the Missing element from array
// input n=9
//arr=[8,3,4,1,2,6,0,7,9]
public class MissingNum {
    // public static void main(String[] args) {
    //     int[] num={8,3,4,1,2,6,0,7,9};
    //     int n=num.length;
    //     int totalsum=(n*(n+1))/2;
    //     int  actualsum=getsum(num);
    //     int missingNum=totalsum-actualsum;
    //     System.out.println(missingNum);
    // }

    
    // public static int getsum(int []arr){
    //     int sum=0;
    //     for(int i=0;i<arr.length;i++){
    //         sum+=arr[i];
           
    // }
    // return sum;

    //     }

//     public static void main(String[] args) {1
//         Scanner sc = new Scanner(System.in);
        
//         // Reading the size of the array
//         System.out.print("Enter the size of the array: ");
//         int size = sc.nextInt();
//         int values[] = new int[size];

//         // Reading values into the array
//         System.out.println("Enter the values:");
//         for (int i = 0; i < values.length; i++) {
//             values[i] = sc.nextInt();
//         }

//         // Calculating the total count using the formula for the sum of the first 'n' natural numbers
//         int totalcount = (size * (size + 1)) / 2;

//         // Calculating the sum of the numbers in the array
//         int sum = sumofthenumber(values);
//         int missing=totalcount-sum;

//         // Printing the results
//         System.out.println("Total count (using formula): " + totalcount);
//         System.out.println("Sum of the numbers in the array: " + sum);
// System.out.println("missing number: "+missing);
//         sc.close();
//     }

//     // Method to calculate the sum of the numbers in the array
//     public static int sumofthenumber(int[] num) {
//         int sum = 0;
//         for (int i = 0; i < num.length; i++) {
//             sum += num[i];
//         }
//         return sum;
//     }
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int size=sc.nextInt();
    int length=size-1;
    int values[]=new int[length];

    for(int i=0;i<values.length;i++){
        values[i]=sc.nextInt();
    }
    int totalsum=(length*(length+1))/2;
    System.out.println("Totalsum: "+totalsum);
    int sum=sumOfThenumber(values);
    System.out.println("Actual sum: "+sum);
    int missingNum=totalsum-sum;
    System.out.println("missing number: "+missingNum);
  
}

public static int sumOfThenumber(int[]num)
{
    int sum=0;
    for(int i=0;i<num.length;i++){
    sum =sum+num[i];
    }
return sum;
}
    
}



