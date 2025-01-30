
interface AREA{
     void area();
}

class circle implements AREA {
    public void area() {
          System.out.println("Circle.area");
     }

}

class rectangle implements AREA {
     public void area() {
          System.out.println("Rectangle.area");
     }
}

  public  class  Interfaces {
     public static void main(String[] args) {
          circle c = new circle();
          rectangle r = new rectangle();
          c.area();
          r.area();
     }

}
