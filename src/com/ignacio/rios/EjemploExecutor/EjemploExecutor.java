package com.ignacio.rios.EjemploExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EjemploExecutor {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService exec = Executors.newSingleThreadExecutor();
        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea ..... ");
            try {
                System.out.println("Nombre del Thread = " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Interrumpe la ejecucion
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea"  );
        };


        exec.submit(tarea);
        exec.shutdown();
        System.out.println("Continuando con  la ejecucion del main 1..>" );
       exec.awaitTermination(5,TimeUnit.SECONDS);
        System.out.println("Continuando con  la ejecucion del main 2..>" );
    }
}
