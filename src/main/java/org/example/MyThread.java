package org.example;

public class MyThread extends Thread{
    MostUselessBox box = new MostUselessBox();
    @Override
    public void run() {
        box.on();
    }
}
