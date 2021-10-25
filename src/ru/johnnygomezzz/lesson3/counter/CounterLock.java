package ru.johnnygomezzz.lesson3.counter;

import java.util.concurrent.locks.ReentrantLock;

public class CounterLock implements Runnable{
    static int counter = 1;

    static ReentrantLock counterLock = new ReentrantLock(true);

    static void incrementCounter(){
        counterLock.lock();

        try{
            System.out.println(Thread.currentThread().getName() + ": " + counter);
            counter++;
        }finally{
            counterLock.unlock();
        }
    }

    @Override
    public void run() {
        while(counter<100){
            incrementCounter();
        }
    }

    public static void main(String[] args) {
        CounterLock counterLock = new CounterLock();
        Thread thread1 = new Thread(counterLock);
        Thread thread2 = new Thread(counterLock);

        thread1.start();
        thread2.start();
    }
}
