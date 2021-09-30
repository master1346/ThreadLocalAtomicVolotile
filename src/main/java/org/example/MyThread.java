package org.example;

public class MyThread extends Thread{
    MostUselessBox mostUselessBox = new MostUselessBox();
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            Thread threadOn = new Thread(null, mostUselessBox::on);
            Thread threadOff = new Thread(null, mostUselessBox::off);
            threadOn.start();

            try {
                threadOn.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            threadOff.start();
            try {
                threadOff.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
