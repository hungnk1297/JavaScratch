package demo_reskill;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoConcurrency {

    public static void main(String[] args) {
//        useThread();
        useExecutor();
    }

    static void useThread() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("t1 " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("t2 " + i);
            }
        });

        t1.start();
        t2.start();
    }

    static void useExecutor() {
        Runnable r1 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("r1 " + i);
            }
        };

        Runnable r2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("r2 " + i);
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(r1);
        executorService.execute(r2);
    }

}
