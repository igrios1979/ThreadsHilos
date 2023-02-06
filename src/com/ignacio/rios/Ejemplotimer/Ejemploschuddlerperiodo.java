package com.ignacio.rios.Ejemplotimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Ejemploschuddlerperiodo {

    public static void main(String[] args) {

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("tarea realizada en "+" ->"
                        + new Date() +" -> " + Thread.currentThread().getName());
                System.out.println("Finaliza....." );
                timer.cancel();
            }
        }, 30000);


        System.out.println("Agendamos tarea por 3 segundos" );

    }

}
