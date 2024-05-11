package Threads_86.good_practice;
/**
 * SandBox
 */
public class SandBox {

    /**
     * this is the best practice on how to use thread
     */
    public static void main(String[] args) {
        Runnable thread1=new Runnable() {
            public void run(){
                for(int i=0;i<100;i++){
                    System.out.println("hi");
                 try{
                    Thread.sleep(10);
                 }catch(InterruptedException e){
                    e.printStackTrace();
                 }
                }
            }
        };
        Runnable thread2=new Runnable() {
            public void run(){
                for(int i=0;i<100;i++){
                    System.out.println("hello");
                    try{
                        Thread.sleep(10);
                     }catch(InterruptedException e){
                        e.printStackTrace();
                     }
                }
            }
        };
        
        Thread t1=new Thread(thread1);
        Thread t2=new Thread(thread2);
        t1.start();
        t2.start();
    }
}
