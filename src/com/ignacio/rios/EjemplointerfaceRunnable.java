package com.ignacio.rios;

import com.ignacio.rios.Runnable.ViajeTarea;

public class EjemplointerfaceRunnable {
    public static void main(String[] args) {


        new Thread(new ViajeTarea("macedonia")).start();
        new Thread(new ViajeTarea("Bosnia")).start();
        new Thread(new ViajeTarea("Maracaibo")).start();


    }
}
