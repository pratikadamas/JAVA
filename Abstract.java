abstract class person{
    String name;
    int age;
    person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class student extends person{
    int rollno;
    int marks;
    student(String name, int age, int rollno, int marks){
        super(name, age);
        this.rollno = rollno;
        this.marks = marks;
    }
}

public class Abstract {
      
    public static void main(String[] args){
         System.out.println("ABSTRACT CLASS IN JAVA"); 
        student s = new student("John", 20, 101,98);
        System.out.println("Name: " + s.name + "\nAge: " + s.age + " \nRollno: " + s.rollno + "\nMarks: " + s.marks);
    }
}
