package com.ignacio.rios.Runnable;

public class EjemplointerfaceRunnableJava8 {
    public static void main(String[] args) {

        Runnable viaje = new Runnable() { //CLASE ANONIMA
            @Override
            public void run() {
                for(int i = 0;i<5;i++){

                    System.out.println(Thread.currentThread().getName() +" -> " + i);
                    try {
                        Thread.sleep((long)(1000* Math.random()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } // fin for
                System.out.println("Viaje a " + Thread.currentThread().getName()  );


            }

            };

        new Thread(viaje, "macedonia").start();
        new Thread(viaje, "Bosnia").start();
        new Thread(viaje, "Maracaibo").start();
        }





    }

