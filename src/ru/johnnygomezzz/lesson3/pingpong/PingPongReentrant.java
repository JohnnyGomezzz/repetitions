package ru.johnnygomezzz.lesson3.pingpong;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PingPongReentrant {
    private static ReentrantLock lock = new ReentrantLock(true);
    private Condition condition = lock.newCondition();

    public static void main(String[] args) {
        PingPongReentrant pingPongReentrant = new PingPongReentrant();
        Thread t1 = new Thread(() -> pingPongReentrant.action("ping", 3));
        Thread t2 = new Thread(() -> pingPongReentrant.action("pong", 3));
        t1.start();
        t2.start();
    }

    public void action(String s, int times) {
        int counter = 1;
        while (counter <= times) {
            run(s, counter);
            counter++;
        }
    }

    public void run(String s, int counter) {
        lock.lock();
        try {
            condition.await(1, TimeUnit.SECONDS);
            System.out.println(s + counter);
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
