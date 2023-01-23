package com.ignacio.rios.ejemplosSync;

import com.ignacio.rios.ejemplosSync.runnable.Consumidor;
import com.ignacio.rios.ejemplosSync.runnable.Panadero;

public class EjemploConsumirProductor {

    public static void main(String[] args) {
        Panaderia p = new Panaderia();

        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();


    }
}
