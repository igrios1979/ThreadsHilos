package com.ignacio.rios.Ejemplotimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class Ejemploschuddlerperiodo {

    public static void main(String[] args) {

        AtomicInteger ai = new AtomicInteger(3);
        Timer timer = new Timer();


        timer.schedule(new TimerTask() {
           int contador = ai.getAndDecrement();

            @Override
            public void run() {
                if (contador > 0){
                    System.out.println("tarea realizada en periodo "+" -> " + contador +" " +
                             new Date() +" -> " + Thread.currentThread().getName());
                       contador--;
                }else{
                    System.out.println("Finaliza....." );
                    timer.cancel();
                }


            }
        }, 5000,10000);


        System.out.println("Agendamos tarea por 3 segundos" );

    }

}
