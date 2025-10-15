class MyThread extends Thread {
    public void run()
    {
        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName()+"-count"+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);

            }
            
        }
    }
}
public class Multi
{
    public static void main(String[]args)
{
    MyThread t1= new MyThread();
    MyThread t2= new MyThread();
    t1.setName("Thread1");
    t2.setName("Thread2");
    t1.start();
    try{
        t1.join();
    }catch(InterruptedException e)
    {
        e.printStackTrace();
    }
    t2.start();
    System.out.println(t2.isAlive());
    System.out.println(Thread.currentThread().getName()+"main thread completed ");
         
}
}