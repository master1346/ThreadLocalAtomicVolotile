package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Thread.*;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws InterruptedException {
       Scanner scanner = new Scanner(System.in);
       Thread thread = new Thread(){
           @Override
           public void run() {
               while(!(this.isInterrupted())){
                   MyThread thread9 = new MyThread();
                   MyThreadOff threadOff = new MyThreadOff();

                   thread9.start();
                   try {
                       thread9.join();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                       interrupt();
                   }

                   threadOff.start();
                   try {
                       threadOff.join();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                       interrupt();
                   }
               }
           }
        };
        Thread threadMain = new Thread(){
            @Override
            public void run() {
                if (!(isInterrupted())) {
                    thread.start();
                    String stopRun = scanner.nextLine();
                    if (stopRun.equals("s")) {
                        System.out.println("Игра прервана!!!!!");
                    } else {
                        System.out.println("Конец игры - ПЕРЕРЫВ");
                    }
                    thread.interrupt();
                }
            }
        };

        threadMain.start();

    }
}
