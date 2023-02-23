package com.ignacio.rios.EjemploExecutor.Tarea;

public class TareaMain {

    public static void main(String[] args) {
 Tarea tarea1 = new Tarea(Tipo.NUMERO);
 Tarea tarea2 = new Tarea(Tipo.LETRA);

        Thread hilo1 = new Thread(tarea1);
        Thread hilo2 = new Thread(tarea2);

        hilo1.start();
        hilo2.start();
    }
}

