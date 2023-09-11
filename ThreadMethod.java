/*join---join() method of java.lang.Thread class is used to mantain the order 
 * of execution of threads. Using join() method, you can make the currently 
 * executing thread to wait for the some other threads to finish their task. 
 * For example, Let’s us assume that there are two threads namely, 
 * thread1 and thread2. You can make thread1 to hold it’s execution for
 *  some time so that thread2 can finish it’s task. After, thread2 finishes 
 *  it’s task, thread1 resumes it’s execution.For this to happen, 
 *  you should call join() method on thread2 within thread1.
 */
public class ThreadMethod {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread started : Task is to print numbers from 0 to 3000");

        final Thread t1 = new Thread() {
            @Override
            public void run() {
                // Thread t1 started : Task is to print numbers from 0 to 1000"

                for (int i = 0; i <= 10; i++) {
                    System.out.println(i);
                }

                System.out.println("Numbers from 0 to 10 are printed");
            }
        };

        final Thread t2 = new Thread() {
            @Override
            public void run() {
                // Thread t2 started : Task is to print numbers from 1001 to 2000

                try {
                    t1.join(5000, 500000); // waits at most 5.5 seconds for thread t1 to finish it's task
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                for (int i = 11; i <= 20; i++) {
                    System.out.println(i);
                }

                System.out.println("Numbers from 1001 to 2000 are printed");
            }
        };

        Thread t3 = new Thread() {
            @Override
            public void run() {
                // Thread t3 started : Task is to print numbers from 2001 to 3000

                try {
                    t2.join(5000); // waits at most 5 seconds for thread t2 to finish it's task
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                for (int i = 21; i <= 30; i++) {
                    System.out.println(i);
                }

                System.out.println("Numbers from 2001 to 3000 are printed");
            }
        };

        t3.start();

        t2.start();

        t1.start();

        t3.join(); // Waits for t3 thread to finish it's task

        // No need enclose this join statement in try-catch blocks as we have already
        // specified the exception with throws clause.

        System.out.println("Task is finished");

    }

}