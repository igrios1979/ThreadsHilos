package com.ignacio.rios.EjemploExecutor;

import java.sql.Time;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploSchudledExecutorService {

    public static void main(String[] args) {

        ScheduledExecutorService executor  = Executors.newScheduledThreadPool(2);


        System.out.println("tarea uno main"  );

        executor.schedule(()->{
            System.out.println(" Tarea con Delay uno  .........."  );
            try {
                TimeUnit.MILLISECONDS.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(" Tarea con Delay  .........."  );

        },5000, TimeUnit.MILLISECONDS);


        System.out.println("otra tarea ................");

        executor.shutdown();




    }
}
