package Threads_86;
import java.util.*;;
public class SandBox {
    public static void main(String[] args) {
      
        Demo1 thread1=new Demo1();
        Demo2 thread2=new Demo2();
        thread1.start();
        try{
            Thread.sleep(2);
         }catch(InterruptedException e){
            e.printStackTrace();
        }
        thread2.start();
    
    }    
/**
 * Threads--> refers to the smalest unit of execution within a process.
 * it is a lightweight process and allows concurrent execution of task
 * 
 * Multi-Threads --> java supports multithreading, which means a java 
 * can have multiple threads concurrently
 * 
 * NOTE --> in this code we trying to make the method run alltogether using Thread
 */
}
class Demo1 extends Thread{
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
}
class Demo2 extends Thread {
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
}