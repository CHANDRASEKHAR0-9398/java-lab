


class MyThread extends Thread{
    public void run(){
        try{
         for (int i = 0; i < 5; i++) {
             
         
            System.out.println(Thread.currentThread().getName()+"    good morning");
            Thread.sleep(1000);
        } } catch(InterruptedException e){
            System.out.println("good morning thread interrupted");

        }
        }}
class MyThrea extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                
             
               System.out.println(Thread.currentThread().getName()+"   hello");
               Thread.sleep(2000);
            }} catch (InterruptedException e) {
                         System.out.println("hello thread interrupted");
   
        }
    }
}
class MyThre extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                
              
               System.out.println(Thread.currentThread().getName()+"   welcome");
               Thread.sleep(3000);
             
            }} catch (InterruptedException e) {
                         System.out.println("hello thread interrupted");
   
        }
    }
}
class Muthreading{
    public static void main(String[] args) {
        MyThread t1= new MyThread();
        MyThrea t2= new MyThrea();
        MyThre t3= new MyThre ();
        t1.setName("THREAD 1");
        t2.setName("THREAD 2");
        t3.setName("THREAD 3");
        t1.start();
        t2.start();
        t3.start();
      System.out.println(Thread.currentThread().getName()+"executed normally "); 
    }
}