
 class parent{
    parent(){
        System.out.println("parent class hashCode() = " + this.hashCode());
    }

    
}

class child extends parent{
    child(){
        System.out.println("child class hashCode() = " + this.hashCode());
    }
}


public class Hashcode {
    public static void main(String args[]) {
        
        child baby = new child();
        System.out.println("baby object hashCode() = " + baby.hashCode());
    }
    
}
