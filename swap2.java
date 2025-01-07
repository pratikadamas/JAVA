
import java.util.Scanner;

public class swap2 {

    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);

       System.out.println("value of a");
       int a= sc.nextInt();

       System.out.println("value of b");
       int b= sc.nextInt();

        System.out.println("After SWAPING value a and b ");
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+"  "+b);
    }
}
