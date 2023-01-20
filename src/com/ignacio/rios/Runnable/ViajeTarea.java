package com.ignacio.rios.Runnable;

public class ViajeTarea implements Runnable{

    private String  nombre;


    public ViajeTarea(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void run() {

        for(int i = 0;i<10;i++){


            System.out.println(nombre +" -> " + i);
            try {
                Thread.sleep((long)(1000* Math.random()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } // fin for
        System.out.println("Viaje a " + nombre );


    }
}
