package org.example;

public class MostUselessBox {
    volatile boolean openCloseBox = true;
    final static int delayTime = 1000;
    public void on() {
        openCloseBox = true;
        System.out.println("Тумблер включен - надо выключить (" + "volatile " + openCloseBox + ")");
        try {
            Thread.sleep(delayTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void off() {
        openCloseBox = false;
        System.out.println("Тумблер выключен - больше не включай (" + "volatile " + openCloseBox + ")");
        try {
            Thread.sleep(delayTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
