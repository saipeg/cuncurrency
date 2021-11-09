package com.epam.lesson2.myVersion;

class Starship implements Runnable {

    private final String name;

    Starship(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Starship launching... " + Thread.currentThread().getName());
        for (int i = 0; i < 10; ++i) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + " " + Thread.currentThread().getName());
        }
        System.out.println("Spaceship launched");
    }

    public void launch() {
        Thread runner = new Thread(this);
        runner.setName(name);
        runner.start();
    }
}


public class Main {

    public static void main(String[] args) {

        Starship starship1 = new Starship("Crew Dragon");
        starship1.launch();

        Starship starship2 = new Starship("Sovets");
        starship1.launch();

        System.out.println("Exit main");

    }

}
