import java.util.Random;

class NumberGenerator extends Thread{
  private static final boolean True = false;
public static int num;
  public void run(){
    Random random=new Random();
    while (true) {
        
        num = random.nextInt(100);  // Generate random number between 0 and 99
        System.out.println("Generated number: " + num);

        try {
            Thread.sleep(1000);  // Wait for 1 second
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    
    }
  }
}
