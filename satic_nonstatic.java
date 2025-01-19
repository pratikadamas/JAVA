

class test{
    // static function
    static  int greater(int a, int b)
    {
        if (a>b)
            return a;
        else
            return b;
    }
    //non static fonction
    void show(){
        System.out.println("Hi I am pratik!");
    }


}

public class satic_nonstatic
{
    public static void main(String[] args)
    {
        int g=test.greater(5,6);
        System.out.println( " greater number is " +g);

        test s1=new test();
        s1.show();



    }
}
