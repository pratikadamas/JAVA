
class overload{
   public void m1(int i){

        System.out.println("int args");
    }
    public void m1(int... f){
        System.out.println("var_args");
    }
}
public class function_overloading 
{
    public static void main(String[] args)
    {
        overload obj = new overload();
        obj.m1();
        obj.m1(10);
        obj.m1(10,20);
        obj.m1(10,20,30);
    }
    
}
