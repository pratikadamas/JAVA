
class overload{
   public void m1(int i){

        System.out.println("int args");
    }
    public void m1(int... f){
        System.out.println("var_args");
    }
    public void m1(String s){
        System.out.println("string args");
    }
    public void m1(StringBuffer sb){
        System.out.println("stringbuffer args");
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
        // obj.m1(10,20,30);
        // obj.m1("hello");
        // obj.m1(new StringBuffer("hello"));
    }
    
}
