

import  java.util.Scanner;

class Base
{
    int x;

}
class Drived1 extends Base
{
    int y;
    Drived1(int x,int y)
    {
        this.y=y;
        super.x=x;
    }
    public void set1(){
        System.out.println("Drived class values in single inheritance "+y+' '+x);
    }
}
class Drived2 extends Drived1
{
    int z;
    Drived2(int a,int b,int c)
    {
        super(a,b);
        this.z=c;
    }
    public void set2(){
        System.out.println("Drived class values multilevel inheritance"+x+' '+y+' '+z);
    }

}
 class Drived3 extends Base
 {
    int z;
    Drived3(int a,int b)
    {
        super.x=a;
        this.z=b;
    }
    public void set3(){
        System.out.println("Drived class values hirrarchical inheritance "+z+' '+x);
    }
 }
public class inheritance
{
    public static void main(String[] args)
    {
        Drived1 d1=new Drived1(10,20);
        d1.set1();
        Drived2 d2=new Drived2(12,22,33);
        d2.set2();
        Drived3 d3=new Drived3(126,123);
        d3.set3();
    }
}
