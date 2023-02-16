package com.ignacio.rios.EjemploExecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture {
    public static void main(String[] args) throws InterruptedException,
            ExecutionException, TimeoutException {

        ExecutorService exec = Executors.newSingleThreadExecutor();

        Callable<String> tarea = () -> { // tarea CALLABLE develve algo
            System.out.println("Inicio de la tarea ..... ");
            try {
                System.out.println("Nombre del Thread = " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Interrumpe la ejecucion
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea"  );
            return "algun dato para devolver"; // devuelve string
        };


        Future<String> resultado = exec.submit(tarea);
        exec.shutdown();

        while(!resultado.isDone()){
            System.out.println("ejecutando tarea ..... ");
            TimeUnit.MILLISECONDS.sleep(1000);

        }

        System.out.println("resultado.isDone() = " + resultado.isDone());
        System.out.println("resultado "+resultado.get(1,TimeUnit.SECONDS));
        System.out.println("FINALIZA LA TAREA = " + resultado.isDone());




    }
}
