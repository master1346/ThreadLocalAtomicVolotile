package org.example;

public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        Magazin magazin1 = new Magazin();
        Magazin magazin2 = new Magazin();
        Magazin magazin3 = new Magazin();

        Thread thread1 = new Thread(null, magazin1::summViruchki, "1");
        Thread thread2 = new Thread(null, magazin2::summViruchki, "2");
        Thread thread3 = new Thread(null, magazin3::summViruchki, "3");

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        magazin1.printAtomic();

    }
}
