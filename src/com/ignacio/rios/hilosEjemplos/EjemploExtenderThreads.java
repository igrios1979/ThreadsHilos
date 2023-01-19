package com.ignacio.rios.hilosEjemplos;

import com.ignacio.rios.hilosEjemplos.Threads.nombreThread;

public class EjemploExtenderThreads {

    public static void main(String[] args) throws InterruptedException {

       Thread hilo = new nombreThread("Hilo uno");
          hilo.start();
          Thread.sleep(100);
        System.out.println(hilo.getState());

    }

}
