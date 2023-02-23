package com.ignacio.rios.EjemploExecutor.Tarea;

import java.util.concurrent.TimeUnit;

public class Tarea implements Runnable {



    private Tipo tipo;

    public Tarea(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        if (tipo == Tipo.NUMERO) {
            for (int i = 1; i < 24; i++) {
                System.out.println(i);
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else if (tipo == Tipo.LETRA) {
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.println(c);
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}



