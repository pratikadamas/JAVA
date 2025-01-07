public class swap {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println("value 0f a = "+a+"  value of b = "+b);
        System.out.println("After SWAPING value a and b ");
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+"  "+b);
    }
    
}
