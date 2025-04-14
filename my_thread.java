class my_thread implements Runnable{

    my_thread(String name){
        Thread t = new Thread(this,name);
        t.start();
        System.out.println(t.getName());

    }
    public void run() {
//        System.out.println(t.getName());
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println(Thread.currentThread().getName()+" ended!");
    }



    public static void main(String[] args) {
        System.out.println("main started!!");
        my_thread obj1=new my_thread("obj1");
        my_thread obj2=new my_thread("obj2");
        System.out.println("main ended!!");
//
    }
}


