
interface Drawable
{  
    void draw();  
    }  
    //Implementation: by second user  
    class Rectangle implements Drawable
    {  
    public void draw()
    {
        System.out.println("drawing rectangle");
    }  
    }  
    class Circle implements Drawable
    {  
    public void draw()
    {
        System.out.println("drawing circle");
    }  
    }  
    //Using interface: by third user  
    class TestInterface1
    {  
    public static void main( String args[] )
    {  
    Circle d =new Circle(); 
    d.draw();  
   Rectangle r=new Rectangle();  
    r.draw();     
    }
    
}  
    
    