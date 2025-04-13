class pg{
   public void nmae(){
        System.out.println("pratik giri");
    }
}

public class anonymous_inner extends pg {
    public static void main(String[] args) {
        anonymous_inner obj=new anonymous_inner();
        obj.nmae();

        anonymous_inner obj1=new anonymous_inner(){
            public void nmae(){
                System.out.println("PRATIK GIRI");
            }
        };
        obj1.nmae();
    }
}
