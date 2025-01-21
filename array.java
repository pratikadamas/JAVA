
import java.util.*;
public class array
{
    public static void main(String ards[])
    {
        Scanner sc =  new Scanner(System.in);
        int arr[]=new int[7];
        System.out.println("Insert array element----");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(" at index "+i);
            
            arr[i]=sc.nextInt();

        }

        System.out.println(" ---Display array---");
        for (int y:arr)
        {
            System.out.println(y);
        }
    }
}