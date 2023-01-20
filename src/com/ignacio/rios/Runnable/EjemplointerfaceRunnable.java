package com.ignacio.rios.Runnable;

public class EjemplointerfaceRunnable {
    public static void main(String[] args) {


        new Thread(new ViajeTarea("macedonia")).start();
        new Thread(new ViajeTarea("Bosnia")).start();
        new Thread(new ViajeTarea("Maracaibo")).start();


    }
}
