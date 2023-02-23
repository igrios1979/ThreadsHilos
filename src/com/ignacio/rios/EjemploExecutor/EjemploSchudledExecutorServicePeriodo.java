package com.ignacio.rios.EjemploExecutor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploSchudledExecutorServicePeriodo {

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executor  = Executors.newScheduledThreadPool(2);


        System.out.println("tarea uno main"  );

        AtomicInteger contador = new AtomicInteger(5);
       //CountDownLatch locked = new CountDownLatch(3);
        Future<?>  future =  executor.scheduleAtFixedRate(()->{
            System.out.println(" Tarea con Delay repetitiva   .........."  );
            try {
                TimeUnit.MILLISECONDS.sleep(500);
                //locked.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //System.out.println(" Tarea con Delay  .........."  );

        },1000, 2000,TimeUnit.MILLISECONDS);

      //  locked.await();



        future.cancel(true);
         // TimeUnit.SECONDS.sleep(10);

        System.out.println("otra tarea ................");

        executor.shutdown();




    }
}
