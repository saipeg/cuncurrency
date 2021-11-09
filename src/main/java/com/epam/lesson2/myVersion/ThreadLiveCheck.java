package com.epam.lesson2.myVersion;

class MyPersonalThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println(Thread.currentThread().isAlive());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

public class ThreadLiveCheck {

    public static void main(String[] args) {
        Thread thread = new MyPersonalThread();
        System.out.println(thread.isAlive());
        thread.start();
    }

}
