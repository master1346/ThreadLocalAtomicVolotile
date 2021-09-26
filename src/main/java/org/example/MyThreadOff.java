package org.example;

public class MyThreadOff extends Thread{
    MostUselessBox box = new MostUselessBox();
    @Override
    public void run(){
        box.off();
    }
}
