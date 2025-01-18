
import java.util.*;
class student{
    int roll;
    String name;
    void setdata(int roll,String name)
    {
        this.roll=roll;
        this.name=name;
    }
    void show()
    {
        System.out.println("Student name: "+name);
        System.out.println("Student roll no: "+roll);
    }

}

public class class_object {
    public static void main(String []args){
     student s1=new student();
     student s2=new student();
     s1.setdata(126, "Pratik Giri");
     s1.show();

     s2.setdata(12, "Akash Giri");
     s2.show();
    }
}
