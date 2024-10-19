import java.util.*;
public class prac35 implements Runnable {
  public static void main(String args[]){
  P35 t1=new P35();
  Thread t=new Thread(t1);
  t.start();
  }

@Override
public void run() {
     for(int i=0;i<10;i++){
        System.out.println(i);
        try {
            Thread.sleep(1000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }     } 
} 
}
