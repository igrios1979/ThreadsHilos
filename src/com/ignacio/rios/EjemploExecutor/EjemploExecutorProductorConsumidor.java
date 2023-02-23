package com.ignacio.rios.EjemploExecutor;

import com.ignacio.rios.ejemplosSync.Panaderia;
import com.ignacio.rios.ejemplosSync.runnable.Consumidor;
import com.ignacio.rios.ejemplosSync.runnable.Panadero;

import java.util.concurrent.*;

public class EjemploExecutorProductorConsumidor {
    public static void main(String[] args) throws InterruptedException,
            ExecutionException, TimeoutException {

      ThreadPoolExecutor exec = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);


     Panaderia p = new Panaderia();
     Runnable productor = new Panadero(p);
     Runnable consumidor = new Consumidor(p);

        Future<?> futuro1 = exec.submit(productor);
        Future<?> futuro2 = exec.submit(consumidor);
        exec.shutdown();


}
}
