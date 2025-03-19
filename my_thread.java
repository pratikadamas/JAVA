public class my_thread extends Thread
{
    public static void main(String[] args) throws InterruptedException
    {
        my_thread t1 = new my_thread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState());
        Thread.sleep(1000);
        System.out.println(t1.getState());


    }
    public void run()
        {
        try {
            System.out.println("RUNNING");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
