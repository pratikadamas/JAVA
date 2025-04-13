class outer{
    void m(){
        System.out.println("outer class");
    }
    class inner{
        void m1(){
        System.out.println("inner class");
        }
    }

}



public class inner_class {
    public static void main(String[] args) {
        outer obj=new outer();
        obj.m();
        outer.inner obj2=obj.new inner();
        obj2.m1();

    }
}
