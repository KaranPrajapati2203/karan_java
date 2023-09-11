public class ThreadDemoExtends {
    public static void main(String[] args) throws InterruptedException {
        // MyClass1 mc = new MyClass1();
        // mc.start();

        Thread1 myThread = new Thread1();
        // instantiating your thread class that implements Runnable interface

        // Thread t = new Thread(myThread);
        // Creating an object to Thread class by passing your thread as an argument

        myThread.start(); // Starting the thread
        /*
         * System.out.println(t.getName());
         * System.out.println("id=="+t.getId());
         * 
         * Thread.sleep(1000);
         * 
         * System.out.println(t.getState());
         */
    }

}

class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " * " + (i + 1) + " = " + i * (i + 1));
        }
    }
}
