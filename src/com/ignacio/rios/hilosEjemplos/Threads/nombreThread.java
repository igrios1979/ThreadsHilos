package com.ignacio.rios.hilosEjemplos.Threads;

public class nombreThread extends Thread {

    public nombreThread(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("inicio el metodo Run... "+getName());

        for (int i = 0;i<10;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName()+"==> " +i);


        }

        System.out.println("finaliza el hilo :-)"+this.getName());
    }


}
