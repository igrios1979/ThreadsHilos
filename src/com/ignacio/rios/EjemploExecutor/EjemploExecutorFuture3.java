package com.ignacio.rios.EjemploExecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture3 {
    public static void main(String[] args) throws InterruptedException,
            ExecutionException, TimeoutException {

        ExecutorService exec = Executors.newFixedThreadPool(3);

        Callable<String> tarea = () -> { // tarea CALLABLE develve algo
            System.out.println("Inicio de la tarea ..... ");
            try {
                System.out.println("Nombre del Thread = " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Interrumpe la ejecucion
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea 1"  );
            return "algun dato para devolver"; // devuelve strig
        };


        Callable<Integer> tarea2 = ()->{
            System.out.println(" Iniciando tarea 3 (Tres) ---->>> " );
            TimeUnit.SECONDS.sleep(5);
          return 10;
        };

        Future<String> resultado = exec.submit(tarea);
        Future<String> resultado2 = exec.submit(tarea);
        Future<Integer> resultado3 = exec.submit(tarea2);

        exec.shutdown();

        while(!(resultado.isDone())&& resultado2.isDone() && resultado3.isDone()){

            System.out.println(String.format("resultado: %s - resultado2 %s - resutlatado3 %s",
                    resultado.isDone()? "finalizo"  :"en proceso ",
                    resultado2.isDone()? "finalizo" :"en proceso ",
                    resultado3.isDone()? "finalizo" :"en proceso "
                    ));


            TimeUnit.MILLISECONDS.sleep(100);

        }

        System.out.println("resultado.isDone() = " + resultado.isDone());
       // System.out.println("resultado "+resultado.get(1,TimeUnit.SECONDS));
        System.out.println("FINALIZA LA TAREA = " + resultado.isDone());




    }
}
