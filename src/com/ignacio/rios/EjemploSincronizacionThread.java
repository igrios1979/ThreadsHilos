package com.ignacio.rios;

import com.ignacio.rios.Runnable.ImprimirFrase;

public class EjemploSincronizacionThread {

    public static void main(String[] args) throws InterruptedException {

        new Thread(new ImprimirFrase("HOLA   ","Que tal ")).start();
        new Thread(new ImprimirFrase("Anda pa´lla ","bobo")).start();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread h3 = new Thread(new ImprimirFrase("Que cara esta"," la cebolla"));
       h3.start();
        Thread.sleep(1500);
        System.out.println("Estado del hilo 3 " + h3.getState());


    }

    public synchronized static void imprimirFrases(String frase1, String frase2){

        System.out.print(frase1+" ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(frase2);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    } // fin metodo estatico


}// Fin clase
