public class childthead implements Runnable{
       String name;
       Thread t;

        childthead( String name){
            this.name=name;
            t=new Thread(this,name);
            t.start();
        }

    public void run(){
        for (int j = 1; j <= 10; j++) {
            System.out.println("child thread "+name+" "+j);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Child thread "+name+" finished");

        }


    public static void main(String[] args) {
        childthead t1=new childthead("CH-01");
        childthead t2=new childthead("CH-02");
        childthead t3=new childthead("CH-03");
        System.out.println(t1.t.getName()   );
        System.out.println(t2.t.getName()   );
        System.out.println(t3.t.getName()   );
        t1.t.setPriority(4);
        t2.t.setPriority(5);
        t3.t.setPriority(8);
        System.out.println(t1.t.getPriority());
        System.out.println(t2.t.getPriority());
        System.out.println(t3.t.getPriority());
    }









}
