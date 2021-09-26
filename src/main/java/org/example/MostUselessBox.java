package org.example;

public class MostUselessBox {
    final static int delayTime = 2000;
    public void on() {
        System.out.println("Тумблер включен - надо выключить");
        try {
            Thread.sleep(delayTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void off() {
        System.out.println("Тумблер выключен - больше не включай");
        try {
            Thread.sleep(delayTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
