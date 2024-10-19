// ::::::::::::::::::::::::::::::::::Using Thread class:::::::::::::::::::::::::::::::::::

// class prac32 extends Thread {
//     @Override
//     public void run() {
//         System.out.println("hellooooo dear");
//     }

//     public static void main(String[] args) {
//         // Creating and starting the thread
//         prac36 t = new prac32();
//         t.start();
//     }
// }

// ::::::::::::::::::::::::::::::: By using the Runnable interface:::::::::::::::::::

class prac32 implements Runnable {
    @Override          
    public void run() {          
        System.out.println("Runnable method is here...");
    }
    
    public static void main(String[] args) {
        // Creating a thread with a Runnable instance
        Thread thread = new Thread(new prac32());
        thread.start();
    }
}

