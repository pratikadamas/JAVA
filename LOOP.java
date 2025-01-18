
 import java.util.Scanner;

public class LOOP
 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int x =sc.nextInt();
        int i =1,sum =0;
         
        while(i<=x){
            sum+=i;
            i++;
        }

        System.out.println("Sum of N natural number is "+sum);
  
    }
  
}
