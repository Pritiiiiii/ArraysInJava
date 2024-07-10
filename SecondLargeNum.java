public class SecondLargeNum {
    public static void main(String[] args) {
        int num[]={6,18,23,5,10};
        int secondLarge=Integer.MIN_VALUE; 
        int large=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
           if(num[i]>large){
            secondLarge=large;
            large=num[i];
           } 
           else if(num[i]>secondLarge && num[i]!=large){
            secondLarge=num[i];
           }
           
        }
        System.out.println("The largest NUmber is" +" " +  large);
        System.out.println("The Second Largest NUmber" +" "+  secondLarge);
       
    }
}
