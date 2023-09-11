public class ThreadDemoImplements {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread thread = new Thread(t1);
        thread.start();
    }
}

class Thread1 implements Runnable {
    @Override
    public void run() {
        // Task of this thread is to print multiplication of successive numbers up to
        // 1000 numbers
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " * " + (i + 1) + " = " + i * (i + 1));
        }
    }
}
