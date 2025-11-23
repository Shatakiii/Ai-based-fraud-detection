package com.fraud.threads;

public class  extends Thread {

    private static int detectionCount = 0;

    // synchronized method (Synchronization requirement)
    public static synchronized void updateCount() {
        detectionCount++;
        System.out.println("Detection Count Updated: " + detectionCount);
    }

    @Override
    public void run() {
        System.out.println("Fraud detection running in thread: " + Thread.currentThread().getName());

        // simulate synchronized access
        updateCount();
    }
}
