

//main Thread
public class multithreading {
    public  static void main(String[] args) {

            World obj = new World();// NEW state
            obj.start();//RANNABLE
        for (int j = 1; j <= 10; j++) {
            System.out.println("Hello ");
        }
    }
}
