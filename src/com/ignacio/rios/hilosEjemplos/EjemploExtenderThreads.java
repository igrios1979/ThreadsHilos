package com.ignacio.rios.hilosEjemplos;

import com.ignacio.rios.hilosEjemplos.Threads.nombreThread;

public class EjemploExtenderThreads {

    public static void main(String[] args) throws InterruptedException {

       Thread hilo = new nombreThread("Hilo uno");
          hilo.start();
          //Thread.sleep(1000);

       Thread hilo2 = new nombreThread("Hilo Do2");
          hilo2.start();

          nombreThread hilo3 = new nombreThread("hilo Tr3s ");
          hilo3.start();

        System.out.println(hilo.getState());


    }

}
