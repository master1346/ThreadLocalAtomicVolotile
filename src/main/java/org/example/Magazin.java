package org.example;

import java.util.concurrent.atomic.AtomicLong;

public class Magazin {

    private final int countCHECK = 100;
    AtomicLong money = new AtomicLong(0);
    private final int[] cash = new int[countCHECK];

    public Magazin() {
        for (int i = 0; i < countCHECK; i++) {
            cash[i] = (int) (1000 * Math.random());
        }
    }

    public void summViruchki() {
        for(int i = 0; i < countCHECK; i++){
            money.addAndGet(cash[i]);
        }
    }

    public void printAtomic(){
        System.out.println("Сумма выручки трех магазинов составила: " + money.get());
    }
}
