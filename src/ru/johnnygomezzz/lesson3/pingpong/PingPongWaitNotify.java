package ru.johnnygomezzz.lesson3.pingpong;

public class PingPongWaitNotify {
    public static void main(String[] args) {
        Object LOCK_OBJECT = new Object();
        Thread ping = new Thread(new PingPongThread(LOCK_OBJECT, "Ping"));
        Thread pong = new Thread(new PingPongThread(LOCK_OBJECT, "Pong"));
        ping.start();
        pong.start();
    }
}
